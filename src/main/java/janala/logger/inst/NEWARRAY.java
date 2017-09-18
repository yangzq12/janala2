package janala.logger.inst;

public class NEWARRAY extends Instruction {
  public NEWARRAY(long tid,int iid, int mid) {
    super(tid,iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitNEWARRAY(this);
  }
  
  public NEWARRAY(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "NEWARRAY iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
