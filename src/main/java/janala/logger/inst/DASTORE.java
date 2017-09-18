package janala.logger.inst;

public class DASTORE extends Instruction {
  public DASTORE(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitDASTORE(this);
  }
  
  public DASTORE(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "DASTORE iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
