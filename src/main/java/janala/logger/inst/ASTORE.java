package janala.logger.inst;

public class ASTORE extends Instruction {
  public int var;

  public ASTORE(long tid, int iid, int mid, int var) {
    super(tid, iid, mid);
    this.var = var;
  }

  public void visit(IVisitor visitor) {
    visitor.visitASTORE(this);
  }
  
  
  public ASTORE(int iid, int mid, int var) {
	    super(iid, mid);
	    this.var = var;
	  }


  @Override
  public String toString() {
    return "ASTORE iid=" + iid + " mid=" + mid + " tid=" + tid+ " var=" + var;
  }
}
