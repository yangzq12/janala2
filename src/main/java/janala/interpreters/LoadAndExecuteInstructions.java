package janala.interpreters;

import janala.config.Config;
import janala.logger.ClassNames;
import janala.logger.inst.IVisitor;
import janala.logger.inst.Instruction;
import janala.utils.MyLogger;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

// Main entry for the interpreter 
public class LoadAndExecuteInstructions {
  private final static Logger logger =
      MyLogger.getLogger(LoadAndExecuteInstructions.class.getName());

  private static Instruction readInst(ObjectInputStream inputStream)
      throws ClassNotFoundException, IOException {
    Instruction inst;

    try {
      inst = (Instruction) inputStream.readObject();
    } catch (EOFException e) {
      inst = null;
    }
    return inst;
  }

  public static void main(String[] args) {
	
    ObjectInputStream inputStream = null;
    HashMap<Long,IVisitor> intps = new HashMap<Long,IVisitor>();
    HashMap<Long,ArrayList<Instruction>> tinst = new HashMap<Long,ArrayList<Instruction>>();
    HashMap<Long,Integer> indexs=new HashMap<Long,Integer>();

    Logger tester = MyLogger.getTestLogger(Config.mainClass + "." + Config.iteration);

    try {
 //   	System.setProperty("user.dir", "/Users/Pig-yang/Documents/GitHub/janala2/catg_tmp");
      inputStream = new ObjectInputStream(new FileInputStream(Config.instance.traceAuxFileName));
      ClassNames cnames = (ClassNames) inputStream.readObject();
      inputStream.close();
      //cnames.init();
      //读取所有指令，按线程号分类
      ObjectInputStream myinputStream;
      Instruction inst;
      myinputStream = new ObjectInputStream(new FileInputStream(Config.instance.traceFileName));
      inst=readInst(myinputStream);
      while(inst !=null){
    	  long tid = inst.tid;
    	  if(!intps.containsKey(tid)){
    		  intps.put(tid, new ConcolicInterpreter(cnames,Config.instance));
    	  }
    	  if(!tinst.containsKey(tid)){
    		  tinst.put(tid, new ArrayList<Instruction>());
    		  indexs.put(tid, 0);   		 
    	  }
    	  tinst.get(tid).add(inst);
    	  inst = readInst(myinputStream);
      }
      myinputStream.close();
      

     //执行指令
      inputStream = new ObjectInputStream(new FileInputStream(Config.instance.traceFileName));

      Instruction next=null;
      inst = readInst(inputStream);

      while (inst != null) {
    	indexs.put(inst.tid, indexs.get(inst.tid)+1);
        if(tinst.get(inst.tid).size() > indexs.get(inst.tid))
          	next = tinst.get(inst.tid).get((indexs.get(inst.tid)));
        intps.get(inst.tid).setNext(next);
        logger.log(Level.FINE, "{0}", inst);
        System.out.println("Visiting " + inst);
        inst.visit(intps.get(inst.tid));
        inst = readInst(inputStream);
      }
      for(IVisitor intp:intps.values()){
    	  ((ConcolicInterpreter) intp).endExecution();
      }
      
      inputStream.close();
      MyLogger.checkLog(tester);
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      System.exit(1);
    } finally {
      try {
        if (inputStream != null) {
          inputStream.close();
        }
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    }
  }
}
