package janala.logger.inst;

public class LOR extends Instruction {
  public LOR(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitLOR(this);
  }
  
  public LOR(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "LOR iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
