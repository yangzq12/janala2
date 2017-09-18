package janala.logger.inst;

public class FRETURN extends Instruction {
  public FRETURN(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitFRETURN(this);
  }
  
  public FRETURN(int iid, int mid) {
	    super(iid, mid);
	  }


  @Override
  public String toString() {
    return "FRETURN iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
