package janala.logger.inst;

public class FREM extends Instruction {
	
  public FREM(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFREM(this);
  }
  
  public FREM(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "FREM iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
