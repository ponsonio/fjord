package fjord.ast.typedefn;

import java.util.List;

import fjord.ast.Node;
import fjord.ast.NodeVisitor;
import fjord.ast.attribute.Attribute;

public class ExceptionDefinition implements Node {

  private final List<Attribute> attributes;
  
  private final UnionTypeCaseData unionTypeCaseData;
  
  public ExceptionDefinition(List<Attribute> attributes, UnionTypeCaseData unionTypeCaseData) {
    this.attributes = attributes;
    this.unionTypeCaseData = unionTypeCaseData;
  }
  
  @Override
  public void accept(NodeVisitor visitor) {
  
  }

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public UnionTypeCaseData getUnionTypeCaseData() {
    return unionTypeCaseData;
  }

}
