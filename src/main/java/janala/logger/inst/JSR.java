package janala.logger.inst;

public class JSR extends Instruction {
  int label;

  public JSR(long tid,int iid, int mid, int label) {
    super(tid,iid, mid);
    this.label = label;
  }

  public void visit(IVisitor visitor) {
    visitor.visitJSR(this);
  }
  
  public JSR(int iid, int mid, int label) {
	    super(iid, mid);
	    this.label = label;
	  }

  @Override
  public String toString() {
    return "JSR iid=" + iid + " mid=" + mid + " tid=" + tid+ " label=" + label;
  }
}
