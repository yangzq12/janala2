package janala.logger.inst;

public class GOTO extends Instruction {
  int label;

  public GOTO(long tid, int iid, int mid, int label) {
    super(tid, iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitGOTO(this);
  }

  public GOTO(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }
  
  @Override
  public String toString() {
    return "GOTO iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
