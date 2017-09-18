package janala.logger.inst;

public class PUTFIELD extends Instruction {
  public int cIdx;
  public int fIdx;
  public String desc;

  public PUTFIELD(long tid,int iid, int mid, int cIdx, int fIdx, String desc) {
    super(tid,iid, mid);
    this.cIdx = cIdx;
    this.fIdx = fIdx;
    this.desc = desc;
  }
  

  public PUTFIELD(int iid, int mid, int cIdx, int fIdx, String desc) {
    super(iid, mid);
    this.cIdx = cIdx;
    this.fIdx = fIdx;
    this.desc = desc;
  }

  public void visit(IVisitor visitor) {
    visitor.visitPUTFIELD(this);
  }

  @Override
  public String toString() {
    return "PUTFIELD iid="
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
