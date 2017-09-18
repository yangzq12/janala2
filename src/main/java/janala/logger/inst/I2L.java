package janala.logger.inst;

public class I2L extends Instruction {
  public I2L(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitI2L(this);
  }
  
  public I2L(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "I2L iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
