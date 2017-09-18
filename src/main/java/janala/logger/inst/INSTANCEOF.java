package janala.logger.inst;

public class INSTANCEOF extends Instruction {
  String type;

  public INSTANCEOF(long tid, int iid, int mid, String type) {
    super(tid,iid, mid);
    this.type = type;
  }

  public void visit(IVisitor visitor) {
    visitor.visitINSTANCEOF(this);
  }
  
  public INSTANCEOF(int iid, int mid, String type) {
	    super(iid, mid);
	    this.type = type;
	  }

  @Override
  public String toString() {
    return "INSTANCEOF iid=" + iid + " mid=" + mid + " tid=" + tid+ " type=" + type;
  }
}
