package janala.logger.inst;

public class I2S extends Instruction {
  public I2S(long tid, int iid, int mid) {
    super(tid, iid, mid);
  }

  public void visit(IVisitor visitor) {
    visitor.visitI2S(this);
  }

  public I2S(int iid, int mid) {
	    super(iid, mid);
	  }
  
  @Override
  public String toString() {
    return "I2S iid=" + iid + " mid=" + mid+ " tid=" + tid;
  }
}
