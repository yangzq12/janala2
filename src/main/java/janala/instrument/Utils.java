package janala.instrument;

import janala.config.Config;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.Opcodes;

public class Utils implements Opcodes {
  public static void addBipushInsn(MethodVisitor mv, int val) {
    switch (val) {
      case 0:
        mv.visitInsn(ICONST_0);
        break;
      case 1:
        mv.visitInsn(ICONST_1);
        break;
      case 2:
        mv.visitInsn(ICONST_2);
        break;
      case 3:
        mv.visitInsn(ICONST_3);
        break;
      case 4:
        mv.visitInsn(ICONST_4);
        break;
      case 5:
        mv.visitInsn(ICONST_5);
        break;
      default:
        mv.visitLdcInsn(new Integer(val));
        break;
    }
  }

  public static void addSpecialInsn(MethodVisitor mv, int val) {
	  addThreadId(mv);
    addBipushInsn(mv, val);
    mv.visitMethodInsn(INVOKESTATIC, Config.instance.analysisClass, 
      "SPECIAL", "(JI)V", false);
  }
  
  public static void addThreadId(MethodVisitor mv){
	  mv.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;",false);
	  mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getId", "()J", false);
  }

  /** Add a set to code to read the given type from the top of the concrete stack
      and invoke GETVALUE method of the analysis class. */
  public static void addValueReadInsn(MethodVisitor mv, String desc, String methodNamePrefix) {
    Type t;

    if (desc.startsWith("(")) {
      t = Type.getReturnType(desc);
    } else {
      t = Type.getType(desc);
    }
    switch (t.getSort()) {
      case Type.DOUBLE:
    	  
        mv.visitInsn(DUP2);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "double", "(DJ)V", false);
        break;
      case Type.LONG:
    	 
        mv.visitInsn(DUP2);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "long", "(JJ)V", false);
        break;
      case Type.ARRAY:
    	  
        mv.visitInsn(DUP);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC,
            Config.instance.analysisClass,
            methodNamePrefix + "Object",
            "(Ljava/lang/Object;J)V", false);
        break;
      case Type.BOOLEAN:
    	
        mv.visitInsn(DUP);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "boolean", "(ZJ)V", false);
        break;
      case Type.BYTE:
    	  
        mv.visitInsn(DUP);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "byte", "(BJ)V", false);
        break;
      case Type.CHAR:
    	  
        mv.visitInsn(DUP);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "char", "(CJ)V", false);
        break;
      case Type.FLOAT:
    	
        mv.visitInsn(DUP);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "float", "(FJ)V", false);
        break;
      case Type.INT:
   
        mv.visitInsn(DUP);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "int", "(IJ)V", false);
        break;
      case Type.OBJECT:
 
        mv.visitInsn(DUP);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC,
            Config.instance.analysisClass,
            methodNamePrefix + "Object",
            "(Ljava/lang/Object;J)V", false);
        break;
      case Type.SHORT:
    	  
        mv.visitInsn(DUP);
        addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "short", "(SJ)V", false);
        break;
      case Type.VOID:
    	  addThreadId(mv);
        mv.visitMethodInsn(
            INVOKESTATIC, Config.instance.analysisClass, methodNamePrefix + "void", "(J)V", false);
        break;
      default:
        System.err.println("Unknown field or method descriptor " + desc);
        System.exit(1);
    }
  }
}
