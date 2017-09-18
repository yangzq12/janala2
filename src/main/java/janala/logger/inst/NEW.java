package janala.logger.inst;

public class NEW extends Instruction {
  String type;
  public int cIdx;

  public NEW(long tid,int iid, int mid, String type, int cIdx) {
    super(tid,iid, mid);
    this.type = type;
    this.cIdx = cIdx;
  }

  public void visit(IVisitor visitor) {
    visitor.visitNEW(this);
  }
  
  public NEW(int iid, int mid, String type, int cIdx) {
	    super(iid, mid);
	    this.type = type;
	    this.cIdx = cIdx;
	  }

  @Override
  public String toString() {
    return "NEW iid=" + iid + " mid=" + mid + " tid=" + tid+ " cIdx=" + cIdx;
  }
}
