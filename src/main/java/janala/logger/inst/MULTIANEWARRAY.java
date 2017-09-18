package janala.logger.inst;

public class MULTIANEWARRAY extends Instruction {
  String desc; // Is it used?
  public int dims;

  public MULTIANEWARRAY(long tid,int iid, int mid, String desc, int dims) {
    super(tid,iid, mid);
    this.desc = desc;
    this.dims = dims;
  }
  
  public MULTIANEWARRAY(int iid, int mid, String desc, int dims) {
	    super(iid, mid);
	    this.desc = desc;
	    this.dims = dims;
	  }

  public void visit(IVisitor visitor) {
    visitor.visitMULTIANEWARRAY(this);
  }

  @Override
  public String toString() {
    return "MULTIANEWARRAY iid=" + iid + " mid=" + mid + " tid=" + tid+ " desc=" + desc + " dims=" + dims;
  }
}
