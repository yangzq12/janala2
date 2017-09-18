package janala.logger.inst;

public class INVOKEMETHOD_EXCEPTION extends Instruction {

  public INVOKEMETHOD_EXCEPTION() {
    super(-1,-1, -1);
  }
  
  public INVOKEMETHOD_EXCEPTION(long tid){
	  super(tid, -1, -1);
  }

  public void visit(IVisitor visitor) {
    visitor.visitINVOKEMETHOD_EXCEPTION(this);
  }

  @Override
  public String toString() {
    return "INVOKEMETHOD_EXCEPTION"+ " tid="+tid;
  }
}
