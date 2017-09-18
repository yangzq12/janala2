package janala.logger.inst;

public class I2F extends Instruction {
  public I2F(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitI2F(this);
  }
  
  public I2F(int iid, int mid) {
	    super(iid, mid);
	  }

  @Override
  public String toString() {
    return "I2F iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
