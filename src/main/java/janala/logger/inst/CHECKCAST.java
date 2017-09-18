package janala.logger.inst;

public class CHECKCAST extends Instruction {
  String type;

  public CHECKCAST(long tid, int iid, int mid, String type) {
    super(tid, iid, mid);
    this.type = type;
  }

  public void visit(IVisitor visitor) {
    visitor.visitCHECKCAST(this);
  }
  
  public CHECKCAST(int iid, int mid, String type) {
	    super(iid, mid);
	    this.type = type;
	  }

  @Override
  public String toString() {
    return "CHECKCAST iid=" + iid + " mid=" + mid+ " tid=" + tid + " type=" + type;
  }
}
