package janala.logger;

import janala.logger.inst.*;

public abstract class AbstractLogger implements Logger {
  protected abstract void log(Instruction insn); 

  public void LDC(long tid, int iid, int mid, int c) {
    log(new LDC_int(tid, iid, mid, c));
  }

  public void LDC(long tid, int iid, int mid, long c) {
    log(new LDC_long(tid, iid, mid, c));
  }

  public void LDC(long tid, int iid, int mid, float c) {
    log(new LDC_float(tid, iid, mid, c));
  }

  public void LDC(long tid, int iid, int mid, double c) {
    log(new LDC_double(tid, iid, mid, c));
  }

  public void LDC(long tid, int iid, int mid, String c) {
    log(new LDC_String(tid, iid, mid, c, System.identityHashCode(c)));
  }

  public void LDC(long tid, int iid, int mid, Object c) {
    log(new LDC_Object(tid, iid, mid, System.identityHashCode(c)));
  }

  public void IINC(long tid, int iid, int mid, int var, int increment) {
    log(new IINC(tid, iid, mid, var, increment));
  }

  public void MULTIANEWARRAY(long tid, int iid, int mid, String desc, int dims) {
    log(new MULTIANEWARRAY(tid, iid, mid, desc, dims));
  }

  public void LOOKUPSWITCH(long tid, int iid, int mid, int dflt, int[] keys, int[] labels) {
    log(new LOOKUPSWITCH(tid, iid, mid, dflt, keys, labels));
  }

  public void TABLESWITCH(long tid, int iid, int mid, int min, int max, int dflt, int[] labels) {
    log(new TABLESWITCH(tid, iid, mid, min, max, dflt, labels));
  }

  public void IFEQ(long tid, int iid, int mid, int label) {
    log(new IFEQ(tid, iid, mid, label));
  }

  public void IFNE(long tid, int iid, int mid, int label) {
    log(new IFNE(tid, iid, mid, label));
  }

  public void IFLT(long tid, int iid, int mid, int label) {
    log(new IFLT(tid, iid, mid, label));
  }

  public void IFGE(long tid, int iid, int mid, int label) {
    log(new IFGE(tid, iid, mid, label));
  }

  public void IFGT(long tid, int iid, int mid, int label) {
    log(new IFGT(tid, iid, mid, label));
  }

  public void IFLE(long tid, int iid, int mid, int label) {
    log(new IFLE(tid, iid, mid, label));
  }

  public void IF_ICMPEQ(long tid, int iid, int mid, int label) {
    log(new IF_ICMPEQ(tid, iid, mid, label));
  }

  public void IF_ICMPNE(long tid, int iid, int mid, int label) {
    log(new IF_ICMPNE(tid, iid, mid, label));
  }

  public void IF_ICMPLT(long tid, int iid, int mid, int label) {
    log(new IF_ICMPLT(tid, iid, mid, label));
  }

  public void IF_ICMPGE(long tid, int iid, int mid, int label) {
    log(new IF_ICMPGE(tid, iid, mid, label));
  }

  public void IF_ICMPGT(long tid, int iid, int mid, int label) {
    log(new IF_ICMPGT(tid, iid, mid, label));
  }

  public void IF_ICMPLE(long tid, int iid, int mid, int label) {
    log(new IF_ICMPLE(tid, iid, mid, label));
  }

  public void IF_ACMPEQ(long tid, int iid, int mid, int label) {
    log(new IF_ACMPEQ(tid, iid, mid, label));
  }

  public void IF_ACMPNE(long tid, int iid, int mid, int label) {
    log(new IF_ACMPNE(tid, iid, mid, label));
  }

  public void GOTO(long tid, int iid, int mid, int label) {
    log(new GOTO(tid, iid, mid, label));
  }

  public void JSR(long tid, int iid, int mid, int label) {
    log(new JSR(tid, iid, mid, label));
  }

  public void IFNULL(long tid, int iid, int mid, int label) {
    log(new IFNULL(tid, iid, mid, label));
  }

  public void IFNONNULL(long tid, int iid, int mid, int label) {
    log(new IFNONNULL(tid, iid, mid, label));
  }

  public void INVOKEVIRTUAL(long tid, int iid, int mid, String owner, String name, String desc) {
    log(new INVOKEVIRTUAL(tid, iid, mid, owner, name, desc));
  }

  public void INVOKESPECIAL(long tid, int iid, int mid, String owner, String name, String desc) {
    log(new INVOKESPECIAL(tid, iid, mid, owner, name, desc));
  }

  public void INVOKESTATIC(long tid, int iid, int mid, String owner, String name, String desc) {
    log(new INVOKESTATIC(tid, iid, mid, owner, name, desc));
  }

  public void INVOKEINTERFACE(long tid, int iid, int mid, String owner, String name, String desc) {
    log(new INVOKEINTERFACE(tid, iid, mid, owner, name, desc));
  }

  public void GETSTATIC(long tid, int iid, int mid, int cIdx, int fIdx, String desc) {
    log(new GETSTATIC(tid, iid, mid, cIdx, fIdx, desc));
  }

  public void PUTSTATIC(long tid, int iid, int mid, int cIdx, int fIdx, String desc) {
    log(new PUTSTATIC(tid, iid, mid, cIdx, fIdx, desc));
  }

  public void GETFIELD(long tid, int iid, int mid, int cIdx, int fIdx, String desc) {
    log(new GETFIELD(tid, iid, mid, cIdx, fIdx, desc));
  }

  public void PUTFIELD(long tid, int iid, int mid, int cIdx, int fIdx, String desc) {
    log(new PUTFIELD(tid, iid, mid, cIdx, fIdx, desc));
  }

  public void NEW(long tid, int iid, int mid, String type, int cIdx) {
    log(new NEW(tid, iid, mid, type, cIdx));
  }

  public void ANEWARRAY(long tid, int iid, int mid, String type) {
    log(new ANEWARRAY(tid, iid, mid, type));
  }

  public void CHECKCAST(long tid, int iid, int mid, String type) {
    log(new CHECKCAST(tid, iid, mid, type));
  }

  public void INSTANCEOF(long tid, int iid, int mid, String type) {
    log(new INSTANCEOF(tid, iid, mid, type));
  }

  public void BIPUSH(long tid, int iid, int mid, int value) {
    log(new BIPUSH(tid, iid, mid, value));
  }

  public void SIPUSH(long tid, int iid, int mid, int value) {
    log(new SIPUSH(tid, iid, mid, value));
  }

  public void NEWARRAY(long tid, int iid, int mid) {
    log(new NEWARRAY(tid, iid, mid));
  }

  public void ILOAD(long tid, int iid, int mid, int var) {
    log(new ILOAD(tid, iid, mid, var));
  }

  public void LLOAD(long tid, int iid, int mid, int var) {
    log(new LLOAD(tid, iid, mid, var));
  }

  public void FLOAD(long tid, int iid, int mid, int var) {
    log(new FLOAD(tid, iid, mid, var));
  }

  public void DLOAD(long tid, int iid, int mid, int var) {
    log(new DLOAD(tid, iid, mid, var));
  }

  public void ALOAD(long tid, int iid, int mid, int var) {
    log(new ALOAD(tid, iid, mid, var));
  }

  public void ISTORE(long tid, int iid, int mid, int var) {
    log(new ISTORE(tid, iid, mid, var));
  }

  public void LSTORE(long tid, int iid, int mid, int var) {
    log(new LSTORE(tid, iid, mid, var));
  }

  public void FSTORE(long tid, int iid, int mid, int var) {
    log(new FSTORE(tid, iid, mid, var));
  }

  public void DSTORE(long tid, int iid, int mid, int var) {
    log(new DSTORE(tid, iid, mid, var));
  }

  public void ASTORE(long tid, int iid, int mid, int var) {
    log(new ASTORE(tid, iid, mid, var));
  }

  public void RET(long tid, int iid, int mid, int var) {
    log(new RET(tid, iid, mid, var));
  }

  public void NOP(long tid, int iid, int mid) {
    log(new NOP(tid, iid, mid));
  }

  public void ACONST_NULL(long tid, int iid, int mid) {
    log(new ACONST_NULL(tid, iid, mid));
  }

  public void ICONST_M1(long tid, int iid, int mid) {
    log(new ICONST_M1(tid, iid, mid));
  }

  public void ICONST_0(long tid, int iid, int mid) {
    log(new ICONST_0(tid, iid, mid));
  }

  public void ICONST_1(long tid, int iid, int mid) {
    log(new ICONST_1(tid, iid, mid));
  }

  public void ICONST_2(long tid, int iid, int mid) {
    log(new ICONST_2(tid, iid, mid));
  }

  public void ICONST_3(long tid, int iid, int mid) {
    log(new ICONST_3(tid, iid, mid));
  }

  public void ICONST_4(long tid, int iid, int mid) {
    log(new ICONST_4(tid, iid, mid));
  }

  public void ICONST_5(long tid, int iid, int mid) {
    log(new ICONST_5(tid, iid, mid));
  }

  public void LCONST_0(long tid, int iid, int mid) {
    log(new LCONST_0(tid, iid, mid));
  }

  public void LCONST_1(long tid, int iid, int mid) {
    log(new LCONST_1(tid, iid, mid));
  }

  public void FCONST_0(long tid, int iid, int mid) {
    log(new FCONST_0(tid, iid, mid));
  }

  public void FCONST_1(long tid, int iid, int mid) {
    log(new FCONST_1(tid, iid, mid));
  }

  public void FCONST_2(long tid, int iid, int mid) {
    log(new FCONST_2(tid, iid, mid));
  }

  public void DCONST_0(long tid, int iid, int mid) {
    log(new DCONST_0(tid, iid, mid));
  }

  public void DCONST_1(long tid, int iid, int mid) {
    log(new DCONST_1(tid, iid, mid));
  }

  public void IALOAD(long tid, int iid, int mid) {
    log(new IALOAD(tid, iid, mid));
  }

  public void LALOAD(long tid, int iid, int mid) {
    log(new LALOAD(tid, iid, mid));
  }

  public void FALOAD(long tid, int iid, int mid) {
    log(new FALOAD(tid, iid, mid));
  }

  public void DALOAD(long tid, int iid, int mid) {
    log(new DALOAD(tid, iid, mid));
  }

  public void AALOAD(long tid, int iid, int mid) {
    log(new AALOAD(tid, iid, mid));
  }

  public void BALOAD(long tid, int iid, int mid) {
    log(new BALOAD(tid, iid, mid));
  }

  public void CALOAD(long tid, int iid, int mid) {
    log(new CALOAD(tid, iid, mid));
  }

  public void SALOAD(long tid, int iid, int mid) {
    log(new SALOAD(tid, iid, mid));
  }

  public void IASTORE(long tid, int iid, int mid) {
    log(new IASTORE(tid, iid, mid));
  }

  public void LASTORE(long tid, int iid, int mid) {
    log(new LASTORE(tid, iid, mid));
  }

  public void FASTORE(long tid, int iid, int mid) {
    log(new FASTORE(tid, iid, mid));
  }

  public void DASTORE(long tid, int iid, int mid) {
    log(new DASTORE(tid, iid, mid));
  }

  public void AASTORE(long tid, int iid, int mid) {
    log(new AASTORE(tid, iid, mid));
  }

  public void BASTORE(long tid, int iid, int mid) {
    log(new BASTORE(tid, iid, mid));
  }

  public void CASTORE(long tid, int iid, int mid) {
    log(new CASTORE(tid, iid, mid));
  }

  public void SASTORE(long tid, int iid, int mid) {
    log(new SASTORE(tid, iid, mid));
  }

  public void POP(long tid, int iid, int mid) {
    log(new POP(tid, iid, mid));
  }

  public void POP2(long tid, int iid, int mid) {
    log(new POP2(tid, iid, mid));
  }

  public void DUP(long tid, int iid, int mid) {
    log(new DUP(tid, iid, mid));
  }

  public void DUP_X1(long tid, int iid, int mid) {
    log(new DUP_X1(tid, iid, mid));
  }

  public void DUP_X2(long tid, int iid, int mid) {
    log(new DUP_X2(tid, iid, mid));
  }

  public void DUP2(long tid, int iid, int mid) {
    log(new DUP2(tid, iid, mid));
  }

  public void DUP2_X1(long tid, int iid, int mid) {
    log(new DUP2_X1(tid, iid, mid));
  }

  public void DUP2_X2(long tid, int iid, int mid) {
    log(new DUP2_X2(tid, iid, mid));
  }

  public void SWAP(long tid, int iid, int mid) {
    log(new SWAP(tid, iid, mid));
  }

  public void IADD(long tid, int iid, int mid) {
    log(new IADD(tid, iid, mid));
  }

  public void LADD(long tid, int iid, int mid) {
    log(new LADD(tid, iid, mid));
  }

  public void FADD(long tid, int iid, int mid) {
    log(new FADD(tid, iid, mid));
  }

  public void DADD(long tid, int iid, int mid) {
    log(new DADD(tid, iid, mid));
  }

  public void ISUB(long tid, int iid, int mid) {
    log(new ISUB(tid, iid, mid));
  }

  public void LSUB(long tid, int iid, int mid) {
    log(new LSUB(tid, iid, mid));
  }

  public void FSUB(long tid, int iid, int mid) {
    log(new FSUB(tid, iid, mid));
  }

  public void DSUB(long tid, int iid, int mid) {
    log(new DSUB(tid, iid, mid));
  }

  public void IMUL(long tid, int iid, int mid) {
    log(new IMUL(tid, iid, mid));
  }

  public void LMUL(long tid, int iid, int mid) {
    log(new LMUL(tid, iid, mid));
  }

  public void FMUL(long tid, int iid, int mid) {
    log(new FMUL(tid, iid, mid));
  }

  public void DMUL(long tid, int iid, int mid) {
    log(new DMUL(tid, iid, mid));
  }

  public void IDIV(long tid, int iid, int mid) {
    log(new IDIV(tid, iid, mid));
  }

  public void LDIV(long tid, int iid, int mid) {
    log(new LDIV(tid, iid, mid));
  }

  public void FDIV(long tid, int iid, int mid) {
    log(new FDIV(tid, iid, mid));
  }

  public void DDIV(long tid, int iid, int mid) {
    log(new DDIV(tid, iid, mid));
  }

  public void IREM(long tid, int iid, int mid) {
    log(new IREM(tid, iid, mid));
  }

  public void LREM(long tid, int iid, int mid) {
    log(new LREM(tid, iid, mid));
  }

  public void FREM(long tid, int iid, int mid) {
    log(new FREM(tid, iid, mid));
  }

  public void DREM(long tid, int iid, int mid) {
    log(new DREM(tid, iid, mid));
  }

  public void INEG(long tid, int iid, int mid) {
    log(new INEG(tid, iid, mid));
  }

  public void LNEG(long tid, int iid, int mid) {
    log(new LNEG(tid, iid, mid));
  }

  public void FNEG(long tid, int iid, int mid) {
    log(new FNEG(tid, iid, mid));
  }

  public void DNEG(long tid, int iid, int mid) {
    log(new DNEG(tid, iid, mid));
  }

  public void ISHL(long tid, int iid, int mid) {
    log(new ISHL(tid, iid, mid));
  }

  public void LSHL(long tid, int iid, int mid) {
    log(new LSHL(tid, iid, mid));
  }

  public void ISHR(long tid, int iid, int mid) {
    log(new ISHR(tid, iid, mid));
  }

  public void LSHR(long tid, int iid, int mid) {
    log(new LSHR(tid, iid, mid));
  }

  public void IUSHR(long tid, int iid, int mid) {
    log(new IUSHR(tid, iid, mid));
  }

  public void LUSHR(long tid, int iid, int mid) {
    log(new LUSHR(tid, iid, mid));
  }

  public void IAND(long tid, int iid, int mid) {
    log(new IAND(tid, iid, mid));
  }

  public void LAND(long tid, int iid, int mid) {
    log(new LAND(tid, iid, mid));
  }

  public void IOR(long tid, int iid, int mid) {
    log(new IOR(tid, iid, mid));
  }

  public void LOR(long tid, int iid, int mid) {
    log(new LOR(tid, iid, mid));
  }

  public void IXOR(long tid, int iid, int mid) {
    log(new IXOR(tid, iid, mid));
  }

  public void LXOR(long tid, int iid, int mid) {
    log(new LXOR(tid, iid, mid));
  }

  public void I2L(long tid, int iid, int mid) {
    log(new I2L(tid, iid, mid));
  }

  public void I2F(long tid, int iid, int mid) {
    log(new I2F(tid, iid, mid));
  }

  public void I2D(long tid, int iid, int mid) {
    log(new I2D(tid, iid, mid));
  }

  public void L2I(long tid, int iid, int mid) {
    log(new L2I(tid, iid, mid));
  }

  public void L2F(long tid, int iid, int mid) {
    log(new L2F(tid, iid, mid));
  }

  public void L2D(long tid, int iid, int mid) {
    log(new L2D(tid, iid, mid));
  }

  public void F2I(long tid, int iid, int mid) {
    log(new F2I(tid, iid, mid));
  }

  public void F2L(long tid, int iid, int mid) {
    log(new F2L(tid, iid, mid));
  }

  public void F2D(long tid, int iid, int mid) {
    log(new F2D(tid, iid, mid));
  }

  public void D2I(long tid, int iid, int mid) {
    log(new D2I(tid, iid, mid));
  }

  public void D2L(long tid, int iid, int mid) {
    log(new D2L(tid, iid, mid));
  }

  public void D2F(long tid, int iid, int mid) {
    log(new D2F(tid, iid, mid));
  }

  public void I2B(long tid, int iid, int mid) {
    log(new I2B(tid, iid, mid));
  }

  public void I2C(long tid, int iid, int mid) {
    log(new I2C(tid, iid, mid));
  }

  public void I2S(long tid, int iid, int mid) {
    log(new I2S(tid, iid, mid));
  }

  public void LCMP(long tid, int iid, int mid) {
    log(new LCMP(tid, iid, mid));
  }

  public void FCMPL(long tid, int iid, int mid) {
    log(new FCMPL(tid, iid, mid));
  }

  public void FCMPG(long tid, int iid, int mid) {
    log(new FCMPG(tid, iid, mid));
  }

  public void DCMPL(long tid, int iid, int mid) {
    log(new DCMPL(tid, iid, mid));
  }

  public void DCMPG(long tid, int iid, int mid) {
    log(new DCMPG(tid, iid, mid));
  }

  public void IRETURN(long tid, int iid, int mid) {
    log(new IRETURN(tid, iid, mid));
  }

  public void LRETURN(long tid, int iid, int mid) {
    log(new LRETURN(tid, iid, mid));
  }

  public void FRETURN(long tid, int iid, int mid) {
    log(new FRETURN(tid, iid, mid));
  }

  public void DRETURN(long tid, int iid, int mid) {
    log(new DRETURN(tid, iid, mid));
  }

  public void ARETURN(long tid, int iid, int mid) {
    log(new ARETURN(tid, iid, mid));
  }

  public void RETURN(long tid, int iid, int mid) {
    log(new RETURN(tid, iid, mid));
  }

  public void ARRAYLENGTH(long tid, int iid, int mid) {
    log(new ARRAYLENGTH(tid, iid, mid));
  }

  public void ATHROW(long tid, int iid, int mid) {
    log(new ATHROW(tid, iid, mid));
  }

  public void MONITORENTER(long tid, int iid, int mid) {
    log(new MONITORENTER(tid, iid, mid));
  }

  public void MONITOREXIT(long tid, int iid, int mid) {
    log(new MONITOREXIT(tid, iid, mid));
  }
  
  public void GETVALUE_double( double v,long tid) {
	    log(new GETVALUE_double( v,tid));
	  }

	  public void GETVALUE_long(long v,long tid) {
	    log(new GETVALUE_long(v,tid));
	  }

	  public void GETVALUE_Object(Object v,long tid) {
	    boolean isString = v instanceof String;
	    log(new GETVALUE_Object(System.identityHashCode(v), isString ? ((String) v) : null, isString, tid));
	  }

	  public void GETVALUE_boolean(boolean v,long tid) {
	    log(new GETVALUE_boolean( v,tid));
	  }

	  public void GETVALUE_byte(byte v,long tid) {
	    log(new GETVALUE_byte( v,tid));
	  }

	  public void GETVALUE_char(char v,long tid) {
	    log(new GETVALUE_char(v,tid));
	  }

	  public void GETVALUE_float(float v,long tid) {
	    log(new GETVALUE_float(v,tid));
	  }

	  public void GETVALUE_int(int v,long tid) {
	    log(new GETVALUE_int(v,tid));
	  }

	  public void GETVALUE_short(short v,long tid) {
	    log(new GETVALUE_short(v,tid));
	  }

	  public void GETVALUE_void(long tid) {
	    log(new GETVALUE_void(tid));
	  }

	  public void INVOKEMETHOD_EXCEPTION(long tid) {
	    log(new INVOKEMETHOD_EXCEPTION(tid));
	  }

	  public void INVOKEMETHOD_END(long tid) {
	    log(new INVOKEMETHOD_END(tid));
	  }

	  public void MAKE_SYMBOLIC(long tid) {
	    log(new MAKE_SYMBOLIC());
	  }

	  public void SPECIAL(long tid, int i) {
	    log(new SPECIAL(tid,i));
	  }
	  ///

  public void GETVALUE_double(double v) {
    log(new GETVALUE_double(v));
  }

  public void GETVALUE_long(long v) {
    log(new GETVALUE_long(v));
  }

  public void GETVALUE_Object(Object v) {
    boolean isString = v instanceof String;
    log(new GETVALUE_Object(System.identityHashCode(v), isString ? ((String) v) : null, isString));
  }

  public void GETVALUE_boolean(boolean v) {
    log(new GETVALUE_boolean(v));
  }

  public void GETVALUE_byte(byte v) {
    log(new GETVALUE_byte(v));
  }

  public void GETVALUE_char(char v) {
    log(new GETVALUE_char(v));
  }

  public void GETVALUE_float(float v) {
    log(new GETVALUE_float(v));
  }

  public void GETVALUE_int(int v) {
    log(new GETVALUE_int(v));
  }

  public void GETVALUE_short(short v) {
    log(new GETVALUE_short(v));
  }

  public void GETVALUE_void() {
    log(new GETVALUE_void());
  }

  public void INVOKEMETHOD_EXCEPTION() {
    log(new INVOKEMETHOD_EXCEPTION());
  }

  public void INVOKEMETHOD_END() {
    log(new INVOKEMETHOD_END());
  }

  public void MAKE_SYMBOLIC() {
    log(new MAKE_SYMBOLIC());
  }

  public void SPECIAL(int i) {
    log(new SPECIAL(i));
  }

  public void flush() {
    log(null);
  }
  
  //////
  public void LDC(int iid, int mid, int c) {
	    log(new LDC_int(iid, mid, c));
	  }

	  public void LDC(int iid, int mid, long c) {
	    log(new LDC_long(iid, mid, c));
	  }

	  public void LDC(int iid, int mid, float c) {
	    log(new LDC_float(iid, mid, c));
	  }

	  public void LDC(int iid, int mid, double c) {
	    log(new LDC_double(iid, mid, c));
	  }

	  public void LDC(int iid, int mid, String c) {
	    log(new LDC_String(iid, mid, c, System.identityHashCode(c)));
	  }

	  public void LDC(int iid, int mid, Object c) {
	    log(new LDC_Object(iid, mid, System.identityHashCode(c)));
	  }

	  public void IINC(int iid, int mid, int var, int increment) {
	    log(new IINC(iid, mid, var, increment));
	  }

	  public void MULTIANEWARRAY(int iid, int mid, String desc, int dims) {
	    log(new MULTIANEWARRAY(iid, mid, desc, dims));
	  }

	  public void LOOKUPSWITCH(int iid, int mid, int dflt, int[] keys, int[] labels) {
	    log(new LOOKUPSWITCH(iid, mid, dflt, keys, labels));
	  }

	  public void TABLESWITCH(int iid, int mid, int min, int max, int dflt, int[] labels) {
	    log(new TABLESWITCH(iid, mid, min, max, dflt, labels));
	  }

	  public void IFEQ(int iid, int mid, int label) {
	    log(new IFEQ(iid, mid, label));
	  }

	  public void IFNE(int iid, int mid, int label) {
	    log(new IFNE(iid, mid, label));
	  }

	  public void IFLT(int iid, int mid, int label) {
	    log(new IFLT(iid, mid, label));
	  }

	  public void IFGE(int iid, int mid, int label) {
	    log(new IFGE(iid, mid, label));
	  }

	  public void IFGT(int iid, int mid, int label) {
	    log(new IFGT(iid, mid, label));
	  }

	  public void IFLE(int iid, int mid, int label) {
	    log(new IFLE(iid, mid, label));
	  }

	  public void IF_ICMPEQ(int iid, int mid, int label) {
	    log(new IF_ICMPEQ(iid, mid, label));
	  }

	  public void IF_ICMPNE(int iid, int mid, int label) {
	    log(new IF_ICMPNE(iid, mid, label));
	  }

	  public void IF_ICMPLT(int iid, int mid, int label) {
	    log(new IF_ICMPLT(iid, mid, label));
	  }

	  public void IF_ICMPGE(int iid, int mid, int label) {
	    log(new IF_ICMPGE(iid, mid, label));
	  }

	  public void IF_ICMPGT(int iid, int mid, int label) {
	    log(new IF_ICMPGT(iid, mid, label));
	  }

	  public void IF_ICMPLE(int iid, int mid, int label) {
	    log(new IF_ICMPLE(iid, mid, label));
	  }

	  public void IF_ACMPEQ(int iid, int mid, int label) {
	    log(new IF_ACMPEQ(iid, mid, label));
	  }

	  public void IF_ACMPNE(int iid, int mid, int label) {
	    log(new IF_ACMPNE(iid, mid, label));
	  }

	  public void GOTO(int iid, int mid, int label) {
	    log(new GOTO(iid, mid, label));
	  }

	  public void JSR(int iid, int mid, int label) {
	    log(new JSR(iid, mid, label));
	  }

	  public void IFNULL(int iid, int mid, int label) {
	    log(new IFNULL(iid, mid, label));
	  }

	  public void IFNONNULL(int iid, int mid, int label) {
	    log(new IFNONNULL(iid, mid, label));
	  }

	  public void INVOKEVIRTUAL(int iid, int mid, String owner, String name, String desc) {
	    log(new INVOKEVIRTUAL(iid, mid, owner, name, desc));
	  }

	  public void INVOKESPECIAL(int iid, int mid, String owner, String name, String desc) {
	    log(new INVOKESPECIAL(iid, mid, owner, name, desc));
	  }

	  public void INVOKESTATIC(int iid, int mid, String owner, String name, String desc) {
	    log(new INVOKESTATIC(iid, mid, owner, name, desc));
	  }

	  public void INVOKEINTERFACE(int iid, int mid, String owner, String name, String desc) {
	    log(new INVOKEINTERFACE(iid, mid, owner, name, desc));
	  }

	  public void GETSTATIC(int iid, int mid, int cIdx, int fIdx, String desc) {
	    log(new GETSTATIC(iid, mid, cIdx, fIdx, desc));
	  }

	  public void PUTSTATIC(int iid, int mid, int cIdx, int fIdx, String desc) {
	    log(new PUTSTATIC(iid, mid, cIdx, fIdx, desc));
	  }

	  public void GETFIELD(int iid, int mid, int cIdx, int fIdx, String desc) {
	    log(new GETFIELD(iid, mid, cIdx, fIdx, desc));
	  }

	  public void PUTFIELD(int iid, int mid, int cIdx, int fIdx, String desc) {
	    log(new PUTFIELD(iid, mid, cIdx, fIdx, desc));
	  }

	  public void NEW(int iid, int mid, String type, int cIdx) {
	    log(new NEW(iid, mid, type, cIdx));
	  }

	  public void ANEWARRAY(int iid, int mid, String type) {
	    log(new ANEWARRAY(iid, mid, type));
	  }

	  public void CHECKCAST(int iid, int mid, String type) {
	   log(new CHECKCAST(iid, mid, type));
	  }

	  public void INSTANCEOF(int iid, int mid, String type) {
	    log(new INSTANCEOF(iid, mid, type));
	  }

	  public void BIPUSH(int iid, int mid, int value) {
	    log(new BIPUSH(iid, mid, value));
	  }

	  public void SIPUSH(int iid, int mid, int value) {
	    log(new SIPUSH(iid, mid, value));
	  }

	  public void NEWARRAY(int iid, int mid) {
	    log(new NEWARRAY(iid, mid));
	  }

	  public void ILOAD(int iid, int mid, int var) {
	    log(new ILOAD(iid, mid, var));
	  }

	  public void LLOAD(int iid, int mid, int var) {
	    log(new LLOAD(iid, mid, var));
	  }

	  public void FLOAD(int iid, int mid, int var) {
	    log(new FLOAD(iid, mid, var));
	  }

	  public void DLOAD(int iid, int mid, int var) {
	    log(new DLOAD(iid, mid, var));
	  }

	  public void ALOAD(int iid, int mid, int var) {
	    log(new ALOAD(iid, mid, var));
	  }

	  public void ISTORE(int iid, int mid, int var) {
	    log(new ISTORE(iid, mid, var));
	  }

	  public void LSTORE(int iid, int mid, int var) {
	    log(new LSTORE(iid, mid, var));
	  }

	  public void FSTORE(int iid, int mid, int var) {
	    log(new FSTORE(iid, mid, var));
	  }

	  public void DSTORE(int iid, int mid, int var) {
	    log(new DSTORE(iid, mid, var));
	  }

	  public void ASTORE(int iid, int mid, int var) {
	    log(new ASTORE(iid, mid, var));
	  }

	  public void RET(int iid, int mid, int var) {
	    log(new RET(iid, mid, var));
	  }

	  public void NOP(int iid, int mid) {
	    log(new NOP(iid, mid));
	  }

	  public void ACONST_NULL(int iid, int mid) {
	    log(new ACONST_NULL(iid, mid));
	  }

	  public void ICONST_M1(int iid, int mid) {
	    log(new ICONST_M1(iid, mid));
	  }

	  public void ICONST_0(int iid, int mid) {
	    log(new ICONST_0(iid, mid));
	  }

	  public void ICONST_1(int iid, int mid) {
	    log(new ICONST_1(iid, mid));
	  }

	  public void ICONST_2(int iid, int mid) {
	    log(new ICONST_2(iid, mid));
	  }

	  public void ICONST_3(int iid, int mid) {
	    log(new ICONST_3(iid, mid));
	  }

	  public void ICONST_4(int iid, int mid) {
	    log(new ICONST_4(iid, mid));
	  }

	  public void ICONST_5(int iid, int mid) {
	    log(new ICONST_5(iid, mid));
	  }

	  public void LCONST_0(int iid, int mid) {
	    log(new LCONST_0(iid, mid));
	  }

	  public void LCONST_1(int iid, int mid) {
	    log(new LCONST_1(iid, mid));
	  }

	  public void FCONST_0(int iid, int mid) {
	    log(new FCONST_0(iid, mid));
	  }

	  public void FCONST_1(int iid, int mid) {
	    log(new FCONST_1(iid, mid));
	  }

	  public void FCONST_2(int iid, int mid) {
	    log(new FCONST_2(iid, mid));
	  }

	  public void DCONST_0(int iid, int mid) {
	    log(new DCONST_0(iid, mid));
	  }

	  public void DCONST_1(int iid, int mid) {
	    log(new DCONST_1(iid, mid));
	  }

	  public void IALOAD(int iid, int mid) {
	    log(new IALOAD(iid, mid));
	  }

	  public void LALOAD(int iid, int mid) {
	    log(new LALOAD(iid, mid));
	  }

	  public void FALOAD(int iid, int mid) {
	    log(new FALOAD(iid, mid));
	  }

	  public void DALOAD(int iid, int mid) {
	    log(new DALOAD(iid, mid));
	  }

	  public void AALOAD(int iid, int mid) {
	    log(new AALOAD(iid, mid));
	  }

	  public void BALOAD(int iid, int mid) {
	    log(new BALOAD(iid, mid));
	  }

	  public void CALOAD(int iid, int mid) {
	    log(new CALOAD(iid, mid));
	  }

	  public void SALOAD(int iid, int mid) {
	    log(new SALOAD(iid, mid));
	  }

	  public void IASTORE(int iid, int mid) {
	    log(new IASTORE(iid, mid));
	  }

	  public void LASTORE(int iid, int mid) {
	    log(new LASTORE(iid, mid));
	  }

	  public void FASTORE(int iid, int mid) {
	    log(new FASTORE(iid, mid));
	  }

	  public void DASTORE(int iid, int mid) {
	    log(new DASTORE(iid, mid));
	  }

	  public void AASTORE(int iid, int mid) {
	    log(new AASTORE(iid, mid));
	  }

	  public void BASTORE(int iid, int mid) {
	    log(new BASTORE(iid, mid));
	  }

	  public void CASTORE(int iid, int mid) {
	    log(new CASTORE(iid, mid));
	  }

	  public void SASTORE(int iid, int mid) {
	    log(new SASTORE(iid, mid));
	  }

	  public void POP(int iid, int mid) {
	    log(new POP(iid, mid));
	  }

	  public void POP2(int iid, int mid) {
	    log(new POP2(iid, mid));
	  }

	  public void DUP(int iid, int mid) {
	    log(new DUP(iid, mid));
	  }

	  public void DUP_X1(int iid, int mid) {
	    log(new DUP_X1(iid, mid));
	  }

	  public void DUP_X2(int iid, int mid) {
	    log(new DUP_X2(iid, mid));
	  }

	  public void DUP2(int iid, int mid) {
	    log(new DUP2(iid, mid));
	  }

	  public void DUP2_X1(int iid, int mid) {
	    log(new DUP2_X1(iid, mid));
	  }

	  public void DUP2_X2(int iid, int mid) {
	    log(new DUP2_X2(iid, mid));
	  }

	  public void SWAP(int iid, int mid) {
	    log(new SWAP(iid, mid));
	  }

	  public void IADD(int iid, int mid) {
	    log(new IADD(iid, mid));
	  }

	  public void LADD(int iid, int mid) {
	    log(new LADD(iid, mid));
	  }

	  public void FADD(int iid, int mid) {
	    log(new FADD(iid, mid));
	  }

	  public void DADD(int iid, int mid) {
	    log(new DADD(iid, mid));
	  }

	  public void ISUB(int iid, int mid) {
	    log(new ISUB(iid, mid));
	  }

	  public void LSUB(int iid, int mid) {
	    log(new LSUB(iid, mid));
	  }

	  public void FSUB(int iid, int mid) {
	    log(new FSUB(iid, mid));
	  }

	  public void DSUB(int iid, int mid) {
	    log(new DSUB(iid, mid));
	  }

	  public void IMUL(int iid, int mid) {
	    log(new IMUL(iid, mid));
	  }

	  public void LMUL(int iid, int mid) {
	    log(new LMUL(iid, mid));
	  }

	  public void FMUL(int iid, int mid) {
	    log(new FMUL(iid, mid));
	  }

	  public void DMUL(int iid, int mid) {
	    log(new DMUL(iid, mid));
	  }

	  public void IDIV(int iid, int mid) {
	    log(new IDIV(iid, mid));
	  }

	  public void LDIV(int iid, int mid) {
	    log(new LDIV(iid, mid));
	  }

	  public void FDIV(int iid, int mid) {
	    log(new FDIV(iid, mid));
	  }

	  public void DDIV(int iid, int mid) {
	    log(new DDIV(iid, mid));
	  }

	  public void IREM(int iid, int mid) {
	    log(new IREM(iid, mid));
	  }

	  public void LREM(int iid, int mid) {
	    log(new LREM(iid, mid));
	  }

	  public void FREM(int iid, int mid) {
	    log(new FREM(iid, mid));
	  }

	  public void DREM(int iid, int mid) {
	    log(new DREM(iid, mid));
	  }

	  public void INEG(int iid, int mid) {
	    log(new INEG(iid, mid));
	  }

	  public void LNEG(int iid, int mid) {
	    log(new LNEG(iid, mid));
	  }

	  public void FNEG(int iid, int mid) {
	    log(new FNEG(iid, mid));
	  }

	  public void DNEG(int iid, int mid) {
	    log(new DNEG(iid, mid));
	  }

	  public void ISHL(int iid, int mid) {
	    log(new ISHL(iid, mid));
	  }

	  public void LSHL(int iid, int mid) {
	    log(new LSHL(iid, mid));
	  }

	  public void ISHR(int iid, int mid) {
	    log(new ISHR(iid, mid));
	  }

	  public void LSHR(int iid, int mid) {
	    log(new LSHR(iid, mid));
	  }

	  public void IUSHR(int iid, int mid) {
	    log(new IUSHR(iid, mid));
	  }

	  public void LUSHR(int iid, int mid) {
	    log(new LUSHR(iid, mid));
	  }

	  public void IAND(int iid, int mid) {
	    log(new IAND(iid, mid));
	  }

	  public void LAND(int iid, int mid) {
	    log(new LAND(iid, mid));
	  }

	  public void IOR(int iid, int mid) {
	    log(new IOR(iid, mid));
	  }

	  public void LOR(int iid, int mid) {
	    log(new LOR(iid, mid));
	  }

	  public void IXOR(int iid, int mid) {
	    log(new IXOR(iid, mid));
	  }

	  public void LXOR(int iid, int mid) {
	    log(new LXOR(iid, mid));
	  }

	  public void I2L(int iid, int mid) {
	    log(new I2L(iid, mid));
	  }

	  public void I2F(int iid, int mid) {
	    log(new I2F(iid, mid));
	  }

	  public void I2D(int iid, int mid) {
	    log(new I2D(iid, mid));
	  }

	  public void L2I(int iid, int mid) {
	    log(new L2I(iid, mid));
	  }

	  public void L2F(int iid, int mid) {
	    log(new L2F(iid, mid));
	  }

	  public void L2D(int iid, int mid) {
	    log(new L2D(iid, mid));
	  }

	  public void F2I(int iid, int mid) {
	    log(new F2I(iid, mid));
	  }

	  public void F2L(int iid, int mid) {
	    log(new F2L(iid, mid));
	  }

	  public void F2D(int iid, int mid) {
	    log(new F2D(iid, mid));
	  }

	  public void D2I(int iid, int mid) {
	    log(new D2I(iid, mid));
	  }

	  public void D2L(int iid, int mid) {
	    log(new D2L(iid, mid));
	  }

	  public void D2F(int iid, int mid) {
	    log(new D2F(iid, mid));
	  }

	  public void I2B(int iid, int mid) {
	    log(new I2B(iid, mid));
	  }

	  public void I2C(int iid, int mid) {
	    log(new I2C(iid, mid));
	  }

	  public void I2S(int iid, int mid) {
	    log(new I2S(iid, mid));
	  }

	  public void LCMP(int iid, int mid) {
	    log(new LCMP(iid, mid));
	  }

	  public void FCMPL(int iid, int mid) {
	    log(new FCMPL(iid, mid));
	  }

	  public void FCMPG(int iid, int mid) {
	    log(new FCMPG(iid, mid));
	  }

	  public void DCMPL(int iid, int mid) {
	    log(new DCMPL(iid, mid));
	  }

	  public void DCMPG(int iid, int mid) {
	    log(new DCMPG(iid, mid));
	  }

	  public void IRETURN(int iid, int mid) {
	    log(new IRETURN(iid, mid));
	  }

	  public void LRETURN(int iid, int mid) {
	    log(new LRETURN(iid, mid));
	  }

	  public void FRETURN(int iid, int mid) {
	    log(new FRETURN(iid, mid));
	  }

	  public void DRETURN(int iid, int mid) {
	    log(new DRETURN(iid, mid));
	  }

	  public void ARETURN(int iid, int mid) {
	    log(new ARETURN(iid, mid));
	  }

	  public void RETURN(int iid, int mid) {
	    log(new RETURN(iid, mid));
	  }

	  public void ARRAYLENGTH(int iid, int mid) {
	    log(new ARRAYLENGTH(iid, mid));
	  }

	  public void ATHROW(int iid, int mid) {
	    log(new ATHROW(iid, mid));
	  }

	  public void MONITORENTER(int iid, int mid) {
	    log(new MONITORENTER(iid, mid));
	  }

	  public void MONITOREXIT(int iid, int mid) {
	    log(new MONITOREXIT(iid, mid));
	  }

}