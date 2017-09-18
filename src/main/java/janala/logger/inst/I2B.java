package janala.logger.inst;

public class I2B extends Instruction {
  public I2B(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitI2B(this);
  }

  public I2B(int iid, int mid) {
	    super(iid, mid);
	  }
  
  @Override
  public String toString() {
    return "I2B iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
