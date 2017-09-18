package janala.logger;

import janala.config.Config;

public final class DJVM {
  private static Logger intp = Config.instance.getLogger();

  private DJVM() {} 

  // For testing purposes
  public static void setInterpreter(Logger logger) {
    intp = logger;
  }

  public static void LDC(long tid, int iid, int mid, int c) {
    intp.LDC(tid, iid, mid, c);
  }

  public static void LDC(long tid, int iid, int mid, long c) {
    intp.LDC(tid, iid, mid, c);
  }

  public static void LDC(long tid, int iid, int mid, float c) {
    intp.LDC(tid, iid, mid, c);
  }
  
  public static void LDC(long tid, int iid, int mid, double c) {
    intp.LDC(tid, iid, mid, c);
  }
  
  public static void LDC(long tid, int iid, int mid, String c) {
    intp.LDC(tid, iid, mid, c);
  }

  public static void LDC(long tid, int iid, int mid, Object c) {
    intp.LDC(tid, iid, mid, c);
  }

  public static void IINC(long tid, int iid, int mid, int var, int increment) {
    intp.IINC(tid, iid, mid, var, increment);
  }

  public static void MULTIANEWARRAY(long tid, int iid, int mid, String desc, int dims) {
    intp.MULTIANEWARRAY(tid, iid, mid, desc, dims);
  }

  public static void LOOKUPSWITCH(long tid, int iid, int mid, int dflt, int[] keys, int[] labels) {
    intp.LOOKUPSWITCH(tid, iid, mid, dflt, keys, labels);
  }

  public static void TABLESWITCH(long tid, int iid, int mid, int min, int max, int dflt, int[] labels) {
    intp.TABLESWITCH(tid, iid, mid, min, max, dflt, labels);
  }

  public static void IFEQ(long tid, int iid, int mid, int label) {
    intp.IFEQ(tid, iid, mid, label);
  }

  public static void IFNE(long tid, int iid, int mid, int label) {
    intp.IFNE(tid, iid, mid, label);
  }

  public static void IFLT(long tid, int iid, int mid, int label) {
    intp.IFLT(tid, iid, mid, label);
  }

  public static void IFGE(long tid, int iid, int mid, int label) {
    intp.IFGE(tid, iid, mid, label);
  }

  public static void IFGT(long tid, int iid, int mid, int label) {
    intp.IFGT(tid, iid, mid, label);
  }

  public static void IFLE(long tid, int iid, int mid, int label) {
    intp.IFLE(tid, iid, mid, label);
  }

  public static void IF_ICMPEQ(long tid, int iid, int mid, int label) {
    intp.IF_ICMPEQ(tid, iid, mid, label);
  }

  public static void IF_ICMPNE(long tid, int iid, int mid, int label) {
    intp.IF_ICMPNE(tid, iid, mid, label);
  }

  public static void IF_ICMPLT(long tid, int iid, int mid, int label) {
    intp.IF_ICMPLT(tid, iid, mid, label);
  }

  public static void IF_ICMPGE(long tid, int iid, int mid, int label) {
    intp.IF_ICMPGE(tid, iid, mid, label);
  }

  public static void IF_ICMPGT(long tid, int iid, int mid, int label) {
    intp.IF_ICMPGT(tid, iid, mid, label);
  }

  public static void IF_ICMPLE(long tid, int iid, int mid, int label) {
    intp.IF_ICMPLE(tid, iid, mid, label);
  }

  public static void IF_ACMPEQ(long tid, int iid, int mid, int label) {
    intp.IF_ACMPEQ(tid, iid, mid, label);
  }

  public static void IF_ACMPNE(long tid, int iid, int mid, int label) {
    intp.IF_ACMPNE(tid, iid, mid, label);
  }

  public static void GOTO(long tid, int iid, int mid, int label) {
    intp.GOTO(tid, iid, mid, label);
  }

  public static void JSR(long tid, int iid, int mid, int label) {
    intp.JSR(tid, iid, mid, label);
  }

  public static void IFNULL(long tid, int iid, int mid, int label) {
    intp.IFNULL(tid, iid, mid, label);
  }

  public static void IFNONNULL(long tid, int iid, int mid, int label) {
    intp.IFNONNULL(tid, iid, mid, label);
  }

  public static void INVOKEVIRTUAL(long tid, int iid, int mid, String owner, String name, String desc) {
    intp.INVOKEVIRTUAL(tid, iid, mid, owner, name, desc);
  }

  public static void INVOKESPECIAL(long tid, int iid, int mid, String owner, String name, String desc) {
    intp.INVOKESPECIAL(tid, iid, mid, owner, name, desc);
  }

  public static void INVOKESTATIC(long tid, int iid, int mid, String owner, String name, String desc) {
    intp.INVOKESTATIC(tid, iid, mid, owner, name, desc);
  }

  public static void INVOKEINTERFACE(long tid, int iid, int mid, String owner, String name, String desc) {
    intp.INVOKEINTERFACE(tid, iid, mid, owner, name, desc);
  }

  public static void GETSTATIC(long tid, int iid, int mid, int cIdx, int fIdx, String desc) {
    intp.GETSTATIC(tid, iid, mid, cIdx, fIdx, desc);
  }

  public static void PUTSTATIC(long tid, int iid, int mid, int cIdx, int fIdx, String desc) {
    intp.PUTSTATIC(tid, iid, mid, cIdx, fIdx, desc);
  }

  public static void GETFIELD(long tid, int iid, int mid, int cIdx, int fIdx, String desc) {
    intp.GETFIELD(tid, iid, mid, cIdx, fIdx, desc);
  }

  public static void PUTFIELD(long tid, int iid, int mid, int cIdx, int fIdx, String desc) {
    intp.PUTFIELD(tid, iid, mid, cIdx, fIdx, desc);
  }

  public static void NEW(long tid, int iid, int mid, String type, int cIdx) {
    intp.NEW(tid, iid, mid, type, cIdx);
  }

  public static void ANEWARRAY(long tid, int iid, int mid, String type) {
    intp.ANEWARRAY(tid, iid, mid, type);
  }

  public static void CHECKCAST(long tid, int iid, int mid, String type) {
    intp.CHECKCAST(tid, iid, mid, type);
  }

  public static void INSTANCEOF(long tid, int iid, int mid, String type) {
    intp.INSTANCEOF(tid, iid, mid, type);
  }

  public static void BIPUSH(long tid, int iid, int mid, int value) {
    intp.BIPUSH(tid, iid, mid, value);
  }

  public static void SIPUSH(long tid, int iid, int mid, int value) {
    intp.SIPUSH(tid, iid, mid, value);
  }

  public static void NEWARRAY(long tid, int iid, int mid) {
    intp.NEWARRAY(tid, iid, mid);
  }

  public static void ILOAD(long tid, int iid, int mid, int var) {
    intp.ILOAD(tid, iid, mid, var);
  }

  public static void LLOAD(long tid, int iid, int mid, int var) {
    intp.LLOAD(tid, iid, mid, var);
  }

  public static void FLOAD(long tid, int iid, int mid, int var) {
    intp.FLOAD(tid, iid, mid, var);
  }

  public static void DLOAD(long tid, int iid, int mid, int var) {
    intp.DLOAD(tid, iid, mid, var);
  }

  public static void ALOAD(long tid, int iid, int mid, int var) {
    intp.ALOAD(tid, iid, mid, var);
  }

  public static void ISTORE(long tid, int iid, int mid, int var) {
    intp.ISTORE(tid, iid, mid, var);
  }

  public static void LSTORE(long tid, int iid, int mid, int var) {
    intp.LSTORE(tid, iid, mid, var);
  }

  public static void FSTORE(long tid, int iid, int mid, int var) {
    intp.FSTORE(tid, iid, mid, var);
  }

  public static void DSTORE(long tid, int iid, int mid, int var) {
    intp.DSTORE(tid, iid, mid, var);
  }

  public static void ASTORE(long tid, int iid, int mid, int var) {
    intp.ASTORE(tid, iid, mid, var);
  }

  public static void RET(long tid, int iid, int mid, int var) {
    intp.RET(tid, iid, mid, var);
  }

  public static void NOP(long tid, int iid, int mid) {
    intp.NOP(tid, iid, mid);
  }

  public static void ACONST_NULL(long tid, int iid, int mid) {
    intp.ACONST_NULL(tid, iid, mid);
  }

  public static void ICONST_M1(long tid, int iid, int mid) {
    intp.ICONST_M1(tid, iid, mid);
  }

  public static void ICONST_0(long tid, int iid, int mid) {
    intp.ICONST_0(tid, iid, mid);
  }

  public static void ICONST_1(long tid, int iid, int mid) {
    intp.ICONST_1(tid, iid, mid);
  }

  public static void ICONST_2(long tid, int iid, int mid) {
    intp.ICONST_2(tid, iid, mid);
  }

  public static void ICONST_3(long tid, int iid, int mid) {
    intp.ICONST_3(tid, iid, mid);
  }

  public static void ICONST_4(long tid, int iid, int mid) {
    intp.ICONST_4(tid, iid, mid);
  }

  public static void ICONST_5(long tid, int iid, int mid) {
    intp.ICONST_5(tid, iid, mid);
  }

  public static void LCONST_0(long tid, int iid, int mid) {
    intp.LCONST_0(tid, iid, mid);
  }

  public static void LCONST_1(long tid, int iid, int mid) {
    intp.LCONST_1(tid, iid, mid);
  }

  public static void FCONST_0(long tid, int iid, int mid) {
    intp.FCONST_0(tid, iid, mid);
  }

  public static void FCONST_1(long tid, int iid, int mid) {
    intp.FCONST_1(tid, iid, mid);
  }

  public static void FCONST_2(long tid, int iid, int mid) {
    intp.FCONST_2(tid, iid, mid);
  }

  public static void DCONST_0(long tid, int iid, int mid) {
    intp.DCONST_0(tid, iid, mid);
  }

  public static void DCONST_1(long tid, int iid, int mid) {
    intp.DCONST_1(tid, iid, mid);
  }

  public static void IALOAD(long tid, int iid, int mid) {
    intp.IALOAD(tid, iid, mid);
  }

  public static void LALOAD(long tid, int iid, int mid) {
    intp.LALOAD(tid, iid, mid);
  }

  public static void FALOAD(long tid, int iid, int mid) {
    intp.FALOAD(tid, iid, mid);
  }

  public static void DALOAD(long tid, int iid, int mid) {
    intp.DALOAD(tid, iid, mid);
  }

  public static void AALOAD(long tid, int iid, int mid) {
    intp.AALOAD(tid, iid, mid);
  }

  public static void BALOAD(long tid, int iid, int mid) {
    intp.BALOAD(tid, iid, mid);
  }

  public static void CALOAD(long tid, int iid, int mid) {
    intp.CALOAD(tid, iid, mid);
  }

  public static void SALOAD(long tid, int iid, int mid) {
    intp.SALOAD(tid, iid, mid);
  }

  public static void IASTORE(long tid, int iid, int mid) {
    intp.IASTORE(tid, iid, mid);
  }

  public static void LASTORE(long tid, int iid, int mid) {
    intp.LASTORE(tid, iid, mid);
  }

  public static void FASTORE(long tid, int iid, int mid) {
    intp.FASTORE(tid, iid, mid);
  }

  public static void DASTORE(long tid, int iid, int mid) {
    intp.DASTORE(tid, iid, mid);
  }

  public static void AASTORE(long tid, int iid, int mid) {
    intp.AASTORE(tid, iid, mid);
  }

  public static void BASTORE(long tid, int iid, int mid) {
    intp.BASTORE(tid, iid, mid);
  }

  public static void CASTORE(long tid, int iid, int mid) {
    intp.CASTORE(tid, iid, mid);
  }

  public static void SASTORE(long tid, int iid, int mid) {
    intp.SASTORE(tid, iid, mid);
  }

  public static void POP(long tid, int iid, int mid) {
    intp.POP(tid, iid, mid);
  }

  public static void POP2(long tid, int iid, int mid) {
    intp.POP2(tid, iid, mid);
  }

  public static void DUP(long tid, int iid, int mid) {
    intp.DUP(tid, iid, mid);
  }

  public static void DUP_X1(long tid, int iid, int mid) {
    intp.DUP_X1(tid, iid, mid);
  }

  public static void DUP_X2(long tid, int iid, int mid) {
    intp.DUP_X2(tid, iid, mid);
  }

  public static void DUP2(long tid, int iid, int mid) {
    intp.DUP2(tid, iid, mid);
  }

  public static void DUP2_X1(long tid, int iid, int mid) {
    intp.DUP2_X1(tid, iid, mid);
  }

  public static void DUP2_X2(long tid, int iid, int mid) {
    intp.DUP2_X2(tid, iid, mid);
  }

  public static void SWAP(long tid, int iid, int mid) {
    intp.SWAP(tid, iid, mid);
  }

  public static void IADD(long tid, int iid, int mid) {
    intp.IADD(tid, iid, mid);
  }

  public static void LADD(long tid, int iid, int mid) {
    intp.LADD(tid, iid, mid);
  }

  public static void FADD(long tid, int iid, int mid) {
    intp.FADD(tid, iid, mid);
  }

  public static void DADD(long tid, int iid, int mid) {
    intp.DADD(tid, iid, mid);
  }

  public static void ISUB(long tid, int iid, int mid) {
    intp.ISUB(tid, iid, mid);
  }

  public static void LSUB(long tid, int iid, int mid) {
    intp.LSUB(tid, iid, mid);
  }

  public static void FSUB(long tid, int iid, int mid) {
    intp.FSUB(tid, iid, mid);
  }

  public static void DSUB(long tid, int iid, int mid) {
    intp.DSUB(tid, iid, mid);
  }

  public static void IMUL(long tid, int iid, int mid) {
    intp.IMUL(tid, iid, mid);
  }

  public static void LMUL(long tid, int iid, int mid) {
    intp.LMUL(tid, iid, mid);
  }

  public static void FMUL(long tid, int iid, int mid) {
    intp.FMUL(tid, iid, mid);
  }

  public static void DMUL(long tid, int iid, int mid) {
    intp.DMUL(tid, iid, mid);
  }

  public static void IDIV(long tid, int iid, int mid) {
    intp.IDIV(tid, iid, mid);
  }

  public static void LDIV(long tid, int iid, int mid) {
    intp.LDIV(tid, iid, mid);
  }

  public static void FDIV(long tid, int iid, int mid) {
    intp.FDIV(tid, iid, mid);
  }

  public static void DDIV(long tid, int iid, int mid) {
    intp.DDIV(tid, iid, mid);
  }

  public static void IREM(long tid, int iid, int mid) {
    intp.IREM(tid, iid, mid);
  }

  public static void LREM(long tid, int iid, int mid) {
    intp.LREM(tid, iid, mid);
  }

  public static void FREM(long tid, int iid, int mid) {
    intp.FREM(tid, iid, mid);
  }

  public static void DREM(long tid, int iid, int mid) {
    intp.DREM(tid, iid, mid);
  }

  public static void INEG(long tid, int iid, int mid) {
    intp.INEG(tid, iid, mid);
  }

  public static void LNEG(long tid, int iid, int mid) {
    intp.LNEG(tid, iid, mid);
  }

  public static void FNEG(long tid, int iid, int mid) {
    intp.FNEG(tid, iid, mid);
  }

  public static void DNEG(long tid, int iid, int mid) {
    intp.DNEG(tid, iid, mid);
  }

  public static void ISHL(long tid, int iid, int mid) {
    intp.ISHL(tid, iid, mid);
  }

  public static void LSHL(long tid, int iid, int mid) {
    intp.LSHL(tid, iid, mid);
  }

  public static void ISHR(long tid, int iid, int mid) {
    intp.ISHR(tid, iid, mid);
  }

  public static void LSHR(long tid, int iid, int mid) {
    intp.LSHR(tid, iid, mid);
  }

  public static void IUSHR(long tid, int iid, int mid) {
    intp.IUSHR(tid, iid, mid);
  }

  public static void LUSHR(long tid, int iid, int mid) {
    intp.LUSHR(tid, iid, mid);
  }

  public static void IAND(long tid, int iid, int mid) {
    intp.IAND(tid, iid, mid);
  }

  public static void LAND(long tid, int iid, int mid) {
    intp.LAND(tid, iid, mid);
  }

  public static void IOR(long tid, int iid, int mid) {
    intp.IOR(tid, iid, mid);
  }

  public static void LOR(long tid, int iid, int mid) {
    intp.LOR(tid, iid, mid);
  }

  public static void IXOR(long tid, int iid, int mid) {
    intp.IXOR(tid, iid, mid);
  }

  public static void LXOR(long tid, int iid, int mid) {
    intp.LXOR(tid, iid, mid);
  }

  public static void I2L(long tid, int iid, int mid) {
    intp.I2L(tid, iid, mid);
  }

  public static void I2F(long tid, int iid, int mid) {
    intp.I2F(tid, iid, mid);
  }

  public static void I2D(long tid, int iid, int mid) {
    intp.I2D(tid, iid, mid);
  }

  public static void L2I(long tid, int iid, int mid) {
    intp.L2I(tid, iid, mid);
  }

  public static void L2F(long tid, int iid, int mid) {
    intp.L2F(tid, iid, mid);
  }

  public static void L2D(long tid, int iid, int mid) {
    intp.L2D(tid, iid, mid);
  }

  public static void F2I(long tid, int iid, int mid) {
    intp.F2I(tid, iid, mid);
  }

  public static void F2L(long tid, int iid, int mid) {
    intp.F2L(tid, iid, mid);
  }

  public static void F2D(long tid, int iid, int mid) {
    intp.F2D(tid, iid, mid);
  }

  public static void D2I(long tid, int iid, int mid) {
    intp.D2I(tid, iid, mid);
  }

  public static void D2L(long tid, int iid, int mid) {
    intp.D2L(tid, iid, mid);
  }

  public static void D2F(long tid, int iid, int mid) {
    intp.D2F(tid, iid, mid);
  }

  public static void I2B(long tid, int iid, int mid) {
    intp.I2B(tid, iid, mid);
  }

  public static void I2C(long tid, int iid, int mid) {
    intp.I2C(tid, iid, mid);
  }

  public static void I2S(long tid, int iid, int mid) {
    intp.I2S(tid, iid, mid);
  }

  public static void LCMP(long tid, int iid, int mid) {
    intp.LCMP(tid, iid, mid);
  }

  public static void FCMPL(long tid, int iid, int mid) {
    intp.FCMPL(tid, iid, mid);
  }

  public static void FCMPG(long tid, int iid, int mid) {
    intp.FCMPG(tid, iid, mid);
  }

  public static void DCMPL(long tid, int iid, int mid) {
    intp.DCMPL(tid, iid, mid);
  }

  public static void DCMPG(long tid, int iid, int mid) {
    intp.DCMPG(tid, iid, mid);
  }

  public static void IRETURN(long tid, int iid, int mid) {
    intp.IRETURN(tid, iid, mid);
  }

  public static void LRETURN(long tid, int iid, int mid) {
    intp.LRETURN(tid, iid, mid);
  }

  public static void FRETURN(long tid, int iid, int mid) {
    intp.FRETURN(tid, iid, mid);
  }

  public static void DRETURN(long tid, int iid, int mid) {
    intp.DRETURN(tid, iid, mid);
  }

  public static void ARETURN(long tid, int iid, int mid) {
    intp.ARETURN(tid, iid, mid);
  }

  public static void RETURN(long tid, int iid, int mid) {
    intp.RETURN(tid, iid, mid);
  }

  public static void ARRAYLENGTH(long tid, int iid, int mid) {
    intp.ARRAYLENGTH(tid, iid, mid);
  }

  public static void ATHROW(long tid, int iid, int mid) {
    intp.ATHROW(tid, iid, mid);
  }

  public static void MONITORENTER(long tid, int iid, int mid) {
    intp.MONITORENTER(tid, iid, mid);
  }

  public static void MONITOREXIT(long tid, int iid, int mid) {
    intp.MONITOREXIT(tid, iid, mid);
  }

  public static void GETVALUE_double(double v,long tid) {
    intp.GETVALUE_double(v,tid);
  }

  public static void GETVALUE_long(long v,long tid) {
    intp.GETVALUE_long(v,tid);
  }

  public static void GETVALUE_Object(Object v,long tid) {
    intp.GETVALUE_Object(v,tid);
  }

  public static void GETVALUE_boolean(boolean v,long tid) {
    intp.GETVALUE_boolean(v,tid);
  }

  public static void GETVALUE_byte( byte v,long tid) {
    intp.GETVALUE_byte( v,tid);
  }

  public static void GETVALUE_char(char v,long tid) {
    intp.GETVALUE_char( v,tid);
  }

  public static void GETVALUE_float(float v,long tid) {
    intp.GETVALUE_float( v,tid);
  }

  public static void GETVALUE_int(int v,long tid) {
    intp.GETVALUE_int(v,tid);
  }

  public static void GETVALUE_short(short v,long tid) {
    intp.GETVALUE_short(v,tid);
  }

  public static void GETVALUE_void(long tid) {
    intp.GETVALUE_void(tid);
  }

  public static void INVOKEMETHOD_EXCEPTION(long tid) {
    intp.INVOKEMETHOD_EXCEPTION(tid);
  }

  public static void INVOKEMETHOD_END(long tid) {
    intp.INVOKEMETHOD_END(tid);
  }

  public static void SPECIAL(long tid, int i) {
    intp.SPECIAL(tid, i);
  }

  public static void MAKE_SYMBOLIC(long tid) {
    intp.MAKE_SYMBOLIC(tid);
  }

  public static void flush() {
    intp.flush();
  }
  
  
  ///
  public static void LDC(int iid, int mid, int c) {
	    intp.LDC(iid, mid, c);
	  }

	  public static void LDC(int iid, int mid, long c) {
	    intp.LDC(iid, mid, c);
	  }

	  public static void LDC(int iid, int mid, float c) {
	    intp.LDC(iid, mid, c);
	  }
	  
	  public static void LDC(int iid, int mid, double c) {
	    intp.LDC(iid, mid, c);
	  }
	  
	  public static void LDC(int iid, int mid, String c) {
	    intp.LDC(iid, mid, c);
	  }

	  public static void LDC(int iid, int mid, Object c) {
	    intp.LDC(iid, mid, c);
	  }

	  public static void IINC(int iid, int mid, int var, int increment) {
	    intp.IINC(iid, mid, var, increment);
	  }

	  public static void MULTIANEWARRAY(int iid, int mid, String desc, int dims) {
	    intp.MULTIANEWARRAY(iid, mid, desc, dims);
	  }

	  public static void LOOKUPSWITCH(int iid, int mid, int dflt, int[] keys, int[] labels) {
	    intp.LOOKUPSWITCH(iid, mid, dflt, keys, labels);
	  }

	  public static void TABLESWITCH(int iid, int mid, int min, int max, int dflt, int[] labels) {
	    intp.TABLESWITCH(iid, mid, min, max, dflt, labels);
	  }

	  public static void IFEQ(int iid, int mid, int label) {
	    intp.IFEQ(iid, mid, label);
	  }

	  public static void IFNE(int iid, int mid, int label) {
	    intp.IFNE(iid, mid, label);
	  }

	  public static void IFLT(int iid, int mid, int label) {
	    intp.IFLT(iid, mid, label);
	  }

	  public static void IFGE(int iid, int mid, int label) {
	    intp.IFGE(iid, mid, label);
	  }

	  public static void IFGT(int iid, int mid, int label) {
	    intp.IFGT(iid, mid, label);
	  }

	  public static void IFLE(int iid, int mid, int label) {
	    intp.IFLE(iid, mid, label);
	  }

	  public static void IF_ICMPEQ(int iid, int mid, int label) {
	    intp.IF_ICMPEQ(iid, mid, label);
	  }

	  public static void IF_ICMPNE(int iid, int mid, int label) {
	    intp.IF_ICMPNE(iid, mid, label);
	  }

	  public static void IF_ICMPLT(int iid, int mid, int label) {
	    intp.IF_ICMPLT(iid, mid, label);
	  }

	  public static void IF_ICMPGE(int iid, int mid, int label) {
	    intp.IF_ICMPGE(iid, mid, label);
	  }

	  public static void IF_ICMPGT(int iid, int mid, int label) {
	    intp.IF_ICMPGT(iid, mid, label);
	  }

	  public static void IF_ICMPLE(int iid, int mid, int label) {
	    intp.IF_ICMPLE(iid, mid, label);
	  }

	  public static void IF_ACMPEQ(int iid, int mid, int label) {
	    intp.IF_ACMPEQ(iid, mid, label);
	  }

	  public static void IF_ACMPNE(int iid, int mid, int label) {
	    intp.IF_ACMPNE(iid, mid, label);
	  }

	  public static void GOTO(int iid, int mid, int label) {
	    intp.GOTO(iid, mid, label);
	  }

	  public static void JSR(int iid, int mid, int label) {
	    intp.JSR(iid, mid, label);
	  }

	  public static void IFNULL(int iid, int mid, int label) {
	    intp.IFNULL(iid, mid, label);
	  }

	  public static void IFNONNULL(int iid, int mid, int label) {
	    intp.IFNONNULL(iid, mid, label);
	  }

	  public static void INVOKEVIRTUAL(int iid, int mid, String owner, String name, String desc) {
	    intp.INVOKEVIRTUAL(iid, mid, owner, name, desc);
	  }

	  public static void INVOKESPECIAL(int iid, int mid, String owner, String name, String desc) {
	    intp.INVOKESPECIAL(iid, mid, owner, name, desc);
	  }

	  public static void INVOKESTATIC(int iid, int mid, String owner, String name, String desc) {
	    intp.INVOKESTATIC(iid, mid, owner, name, desc);
	  }

	  public static void INVOKEINTERFACE(int iid, int mid, String owner, String name, String desc) {
	    intp.INVOKEINTERFACE(iid, mid, owner, name, desc);
	  }

	  public static void GETSTATIC(int iid, int mid, int cIdx, int fIdx, String desc) {
	    intp.GETSTATIC(iid, mid, cIdx, fIdx, desc);
	  }

	  public static void PUTSTATIC(int iid, int mid, int cIdx, int fIdx, String desc) {
	    intp.PUTSTATIC(iid, mid, cIdx, fIdx, desc);
	  }

	  public static void GETFIELD(int iid, int mid, int cIdx, int fIdx, String desc) {
	    intp.GETFIELD(iid, mid, cIdx, fIdx, desc);
	  }

	  public static void PUTFIELD(int iid, int mid, int cIdx, int fIdx, String desc) {
	    intp.PUTFIELD(iid, mid, cIdx, fIdx, desc);
	  }

	  public static void NEW(int iid, int mid, String type, int cIdx) {
	    intp.NEW(iid, mid, type, cIdx);
	  }

	  public static void ANEWARRAY(int iid, int mid, String type) {
	    intp.ANEWARRAY(iid, mid, type);
	  }

	  public static void CHECKCAST(int iid, int mid, String type) {
	    intp.CHECKCAST(iid, mid, type);
	  }

	  public static void INSTANCEOF(int iid, int mid, String type) {
	    intp.INSTANCEOF(iid, mid, type);
	  }

	  public static void BIPUSH(int iid, int mid, int value) {
	    intp.BIPUSH(iid, mid, value);
	  }

	  public static void SIPUSH(int iid, int mid, int value) {
	    intp.SIPUSH(iid, mid, value);
	  }

	  public static void NEWARRAY(int iid, int mid) {
	    intp.NEWARRAY(iid, mid);
	  }

	  public static void ILOAD(int iid, int mid, int var) {
	    intp.ILOAD(iid, mid, var);
	  }

	  public static void LLOAD(int iid, int mid, int var) {
	    intp.LLOAD(iid, mid, var);
	  }

	  public static void FLOAD(int iid, int mid, int var) {
	    intp.FLOAD(iid, mid, var);
	  }

	  public static void DLOAD(int iid, int mid, int var) {
	    intp.DLOAD(iid, mid, var);
	  }

	  public static void ALOAD(int iid, int mid, int var) {
	    intp.ALOAD(iid, mid, var);
	  }

	  public static void ISTORE(int iid, int mid, int var) {
	    intp.ISTORE(iid, mid, var);
	  }

	  public static void LSTORE(int iid, int mid, int var) {
	    intp.LSTORE(iid, mid, var);
	  }

	  public static void FSTORE(int iid, int mid, int var) {
	    intp.FSTORE(iid, mid, var);
	  }

	  public static void DSTORE(int iid, int mid, int var) {
	    intp.DSTORE(iid, mid, var);
	  }

	  public static void ASTORE(int iid, int mid, int var) {
	    intp.ASTORE(iid, mid, var);
	  }

	  public static void RET(int iid, int mid, int var) {
	    intp.RET(iid, mid, var);
	  }

	  public static void NOP(int iid, int mid) {
	    intp.NOP(iid, mid);
	  }

	  public static void ACONST_NULL(int iid, int mid) {
	    intp.ACONST_NULL(iid, mid);
	  }

	  public static void ICONST_M1(int iid, int mid) {
	    intp.ICONST_M1(iid, mid);
	  }

	  public static void ICONST_0(int iid, int mid) {
	    intp.ICONST_0(iid, mid);
	  }

	  public static void ICONST_1(int iid, int mid) {
	    intp.ICONST_1(iid, mid);
	  }

	  public static void ICONST_2(int iid, int mid) {
	    intp.ICONST_2(iid, mid);
	  }

	  public static void ICONST_3(int iid, int mid) {
	    intp.ICONST_3(iid, mid);
	  }

	  public static void ICONST_4(int iid, int mid) {
	    intp.ICONST_4(iid, mid);
	  }

	  public static void ICONST_5(int iid, int mid) {
	    intp.ICONST_5(iid, mid);
	  }

	  public static void LCONST_0(int iid, int mid) {
	    intp.LCONST_0(iid, mid);
	  }

	  public static void LCONST_1(int iid, int mid) {
	    intp.LCONST_1(iid, mid);
	  }

	  public static void FCONST_0(int iid, int mid) {
	    intp.FCONST_0(iid, mid);
	  }

	  public static void FCONST_1(int iid, int mid) {
	    intp.FCONST_1(iid, mid);
	  }

	  public static void FCONST_2(int iid, int mid) {
	    intp.FCONST_2(iid, mid);
	  }

	  public static void DCONST_0(int iid, int mid) {
	    intp.DCONST_0(iid, mid);
	  }

	  public static void DCONST_1(int iid, int mid) {
	    intp.DCONST_1(iid, mid);
	  }

	  public static void IALOAD(int iid, int mid) {
	    intp.IALOAD(iid, mid);
	  }

	  public static void LALOAD(int iid, int mid) {
	    intp.LALOAD(iid, mid);
	  }

	  public static void FALOAD(int iid, int mid) {
	    intp.FALOAD(iid, mid);
	  }

	  public static void DALOAD(int iid, int mid) {
	    intp.DALOAD(iid, mid);
	  }

	  public static void AALOAD(int iid, int mid) {
	    intp.AALOAD(iid, mid);
	  }

	  public static void BALOAD(int iid, int mid) {
	    intp.BALOAD(iid, mid);
	  }

	  public static void CALOAD(int iid, int mid) {
	    intp.CALOAD(iid, mid);
	  }

	  public static void SALOAD(int iid, int mid) {
	    intp.SALOAD(iid, mid);
	  }

	  public static void IASTORE(int iid, int mid) {
	    intp.IASTORE(iid, mid);
	  }

	  public static void LASTORE(int iid, int mid) {
	    intp.LASTORE(iid, mid);
	  }

	  public static void FASTORE(int iid, int mid) {
	    intp.FASTORE(iid, mid);
	  }

	  public static void DASTORE(int iid, int mid) {
	    intp.DASTORE(iid, mid);
	  }

	  public static void AASTORE(int iid, int mid) {
	    intp.AASTORE(iid, mid);
	  }

	  public static void BASTORE(int iid, int mid) {
	    intp.BASTORE(iid, mid);
	  }

	  public static void CASTORE(int iid, int mid) {
	    intp.CASTORE(iid, mid);
	  }

	  public static void SASTORE(int iid, int mid) {
	    intp.SASTORE(iid, mid);
	  }

	  public static void POP(int iid, int mid) {
	    intp.POP(iid, mid);
	  }

	  public static void POP2(int iid, int mid) {
	    intp.POP2(iid, mid);
	  }

	  public static void DUP(int iid, int mid) {
	    intp.DUP(iid, mid);
	  }

	  public static void DUP_X1(int iid, int mid) {
	    intp.DUP_X1(iid, mid);
	  }

	  public static void DUP_X2(int iid, int mid) {
	    intp.DUP_X2(iid, mid);
	  }

	  public static void DUP2(int iid, int mid) {
	    intp.DUP2(iid, mid);
	  }

	  public static void DUP2_X1(int iid, int mid) {
	    intp.DUP2_X1(iid, mid);
	  }

	  public static void DUP2_X2(int iid, int mid) {
	    intp.DUP2_X2(iid, mid);
	  }

	  public static void SWAP(int iid, int mid) {
	    intp.SWAP(iid, mid);
	  }

	  public static void IADD(int iid, int mid) {
	    intp.IADD(iid, mid);
	  }

	  public static void LADD(int iid, int mid) {
	    intp.LADD(iid, mid);
	  }

	  public static void FADD(int iid, int mid) {
	    intp.FADD(iid, mid);
	  }

	  public static void DADD(int iid, int mid) {
	    intp.DADD(iid, mid);
	  }

	  public static void ISUB(int iid, int mid) {
	    intp.ISUB(iid, mid);
	  }

	  public static void LSUB(int iid, int mid) {
	    intp.LSUB(iid, mid);
	  }

	  public static void FSUB(int iid, int mid) {
	    intp.FSUB(iid, mid);
	  }

	  public static void DSUB(int iid, int mid) {
	    intp.DSUB(iid, mid);
	  }

	  public static void IMUL(int iid, int mid) {
	    intp.IMUL(iid, mid);
	  }

	  public static void LMUL(int iid, int mid) {
	    intp.LMUL(iid, mid);
	  }

	  public static void FMUL(int iid, int mid) {
	    intp.FMUL(iid, mid);
	  }

	  public static void DMUL(int iid, int mid) {
	    intp.DMUL(iid, mid);
	  }

	  public static void IDIV(int iid, int mid) {
	    intp.IDIV(iid, mid);
	  }

	  public static void LDIV(int iid, int mid) {
	    intp.LDIV(iid, mid);
	  }

	  public static void FDIV(int iid, int mid) {
	    intp.FDIV(iid, mid);
	  }

	  public static void DDIV(int iid, int mid) {
	    intp.DDIV(iid, mid);
	  }

	  public static void IREM(int iid, int mid) {
	    intp.IREM(iid, mid);
	  }

	  public static void LREM(int iid, int mid) {
	    intp.LREM(iid, mid);
	  }

	  public static void FREM(int iid, int mid) {
	    intp.FREM(iid, mid);
	  }

	  public static void DREM(int iid, int mid) {
	    intp.DREM(iid, mid);
	  }

	  public static void INEG(int iid, int mid) {
	    intp.INEG(iid, mid);
	  }

	  public static void LNEG(int iid, int mid) {
	    intp.LNEG(iid, mid);
	  }

	  public static void FNEG(int iid, int mid) {
	    intp.FNEG(iid, mid);
	  }

	  public static void DNEG(int iid, int mid) {
	    intp.DNEG(iid, mid);
	  }

	  public static void ISHL(int iid, int mid) {
	    intp.ISHL(iid, mid);
	  }

	  public static void LSHL(int iid, int mid) {
	    intp.LSHL(iid, mid);
	  }

	  public static void ISHR(int iid, int mid) {
	    intp.ISHR(iid, mid);
	  }

	  public static void LSHR(int iid, int mid) {
	    intp.LSHR(iid, mid);
	  }

	  public static void IUSHR(int iid, int mid) {
	    intp.IUSHR(iid, mid);
	  }

	  public static void LUSHR(int iid, int mid) {
	    intp.LUSHR(iid, mid);
	  }

	  public static void IAND(int iid, int mid) {
	    intp.IAND(iid, mid);
	  }

	  public static void LAND(int iid, int mid) {
	    intp.LAND(iid, mid);
	  }

	  public static void IOR(int iid, int mid) {
	    intp.IOR(iid, mid);
	  }

	  public static void LOR(int iid, int mid) {
	    intp.LOR(iid, mid);
	  }

	  public static void IXOR(int iid, int mid) {
	    intp.IXOR(iid, mid);
	  }

	  public static void LXOR(int iid, int mid) {
	    intp.LXOR(iid, mid);
	  }

	  public static void I2L(int iid, int mid) {
	    intp.I2L(iid, mid);
	  }

	  public static void I2F(int iid, int mid) {
	    intp.I2F(iid, mid);
	  }

	  public static void I2D(int iid, int mid) {
	    intp.I2D(iid, mid);
	  }

	  public static void L2I(int iid, int mid) {
	    intp.L2I(iid, mid);
	  }

	  public static void L2F(int iid, int mid) {
	    intp.L2F(iid, mid);
	  }

	  public static void L2D(int iid, int mid) {
	    intp.L2D(iid, mid);
	  }

	  public static void F2I(int iid, int mid) {
	    intp.F2I(iid, mid);
	  }

	  public static void F2L(int iid, int mid) {
	    intp.F2L(iid, mid);
	  }

	  public static void F2D(int iid, int mid) {
	    intp.F2D(iid, mid);
	  }

	  public static void D2I(int iid, int mid) {
	    intp.D2I(iid, mid);
	  }

	  public static void D2L(int iid, int mid) {
	    intp.D2L(iid, mid);
	  }

	  public static void D2F(int iid, int mid) {
	    intp.D2F(iid, mid);
	  }

	  public static void I2B(int iid, int mid) {
	    intp.I2B(iid, mid);
	  }

	  public static void I2C(int iid, int mid) {
	    intp.I2C(iid, mid);
	  }

	  public static void I2S(int iid, int mid) {
	    intp.I2S(iid, mid);
	  }

	  public static void LCMP(int iid, int mid) {
	    intp.LCMP(iid, mid);
	  }

	  public static void FCMPL(int iid, int mid) {
	    intp.FCMPL(iid, mid);
	  }

	  public static void FCMPG(int iid, int mid) {
	    intp.FCMPG(iid, mid);
	  }

	  public static void DCMPL(int iid, int mid) {
	    intp.DCMPL(iid, mid);
	  }

	  public static void DCMPG(int iid, int mid) {
	    intp.DCMPG(iid, mid);
	  }

	  public static void IRETURN(int iid, int mid) {
	    intp.IRETURN(iid, mid);
	  }

	  public static void LRETURN(int iid, int mid) {
	    intp.LRETURN(iid, mid);
	  }

	  public static void FRETURN(int iid, int mid) {
	    intp.FRETURN(iid, mid);
	  }

	  public static void DRETURN(int iid, int mid) {
	    intp.DRETURN(iid, mid);
	  }

	  public static void ARETURN(int iid, int mid) {
	    intp.ARETURN(iid, mid);
	  }

	  public static void RETURN(int iid, int mid) {
	    intp.RETURN(iid, mid);
	  }

	  public static void ARRAYLENGTH(int iid, int mid) {
	    intp.ARRAYLENGTH(iid, mid);
	  }

	  public static void ATHROW(int iid, int mid) {
	    intp.ATHROW(iid, mid);
	  }

	  public static void MONITORENTER(int iid, int mid) {
	    intp.MONITORENTER(iid, mid);
	  }

	  public static void MONITOREXIT(int iid, int mid) {
	    intp.MONITOREXIT(iid, mid);
	  }

	  public static void GETVALUE_double(double v) {
		    intp.GETVALUE_double(v);
		  }

		  public static void GETVALUE_long(long v) {
		    intp.GETVALUE_long(v);
		  }

		  public static void GETVALUE_Object(Object v) {
		    intp.GETVALUE_Object(v);
		  }

		  public static void GETVALUE_boolean(boolean v) {
		    intp.GETVALUE_boolean(v);
		  }

		  public static void GETVALUE_byte(byte v) {
		    intp.GETVALUE_byte(v);
		  }

		  public static void GETVALUE_char(char v) {
		    intp.GETVALUE_char(v);
		  }

		  public static void GETVALUE_float(float v) {
		    intp.GETVALUE_float(v);
		  }

		  public static void GETVALUE_int(int v) {
		    intp.GETVALUE_int(v);
		  }

		  public static void GETVALUE_short(short v) {
		    intp.GETVALUE_short(v);
		  }

		  public static void GETVALUE_void() {
		    intp.GETVALUE_void();
		  }

		  public static void INVOKEMETHOD_EXCEPTION() {
		    intp.INVOKEMETHOD_EXCEPTION();
		  }

		  public static void INVOKEMETHOD_END() {
		    intp.INVOKEMETHOD_END();
		  }

		  public static void SPECIAL(int i) {
		    intp.SPECIAL(i);
		  }

		  public static void MAKE_SYMBOLIC() {
		    intp.MAKE_SYMBOLIC();
		  }
}
