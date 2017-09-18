package janala.logger.inst;

public class PUTSTATIC extends Instruction {
  public int cIdx;
  public int fIdx;
  public String desc;

  public PUTSTATIC(long tid,int iid, int mid, int cIdx, int fIdx, String desc) {
    super(tid,iid, mid);
    this.cIdx = cIdx;
    this.fIdx = fIdx;
    this.desc = desc;
  }

  public void visit(IVisitor visitor) {
    visitor.visitPUTSTATIC(this);
  }
  
  public PUTSTATIC(int iid, int mid, int cIdx, int fIdx, String desc) {
	    super(iid, mid);
	    this.cIdx = cIdx;
	    this.fIdx = fIdx;
	    this.desc = desc;
	  }

  @Override
  public String toString() {
    return "PUTSTATIC iid="
        + iid
        + " mid="
        + mid
        + " tid=" + tid
        + " cIdx="
        + cIdx
        + " fIdx="
        + fIdx
        + " desc="
        + desc;
  }
}
