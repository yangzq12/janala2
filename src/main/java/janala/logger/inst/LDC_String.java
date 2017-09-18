package janala.logger.inst;

public class LDC_String extends Instruction {
  public String c;
  public int address;

  public LDC_String(long tid,int iid, int mid, String c, int address) {
    super(tid,iid, mid);
    this.c = c;
    this.address = address;
  }

  public LDC_String(int iid, int mid, String c, int address) {
	    super(iid, mid);
	    this.c = c;
	    this.address = address;
	  }
  
  public void visit(IVisitor visitor) {
    visitor.visitLDC_String(this);
  }

  @Override
  public String toString() {
    return "LDC_String iid=" + iid + " mid=" + mid + " tid=" + tid+ " c=" + c + " address=" + address;
  }
}
