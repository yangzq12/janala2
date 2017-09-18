package janala.logger.inst;

public class LDC_float extends Instruction {
  public float c;

  public LDC_float(long tid,int iid, int mid, float c) {
    super(tid,iid, mid);
    this.c = c;
  }
  
  public LDC_float(int iid, int mid, float c) {
	    super(iid, mid);
	    this.c = c;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitLDC_float(this);
  }

  @Override
  public String toString() {
    return "LDC_float iid=" + iid + " mid=" + mid + " tid=" + tid+ " c=" + c;
  }
}
