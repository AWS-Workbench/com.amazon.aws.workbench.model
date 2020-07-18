/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Acl Entry Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference <em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getRuleNumber_java_lang_Number_ <em>Rule Number java lang Number </em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference <em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_ <em>Direction software amazon awscdk services ec2 Traffic Direction </em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getNetworkAclEntryName_java_lang_String_ <em>Network Acl Entry Name java lang String </em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getRuleAction_software_amazon_awscdk_services_ec2_Action_ <em>Rule Action software amazon awscdk services ec2 Action </em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.NetworkAclEntryBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2()
 * @model
 * @generated
 */
public interface NetworkAclEntryBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>' attribute.
	 * @see #setCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference(String)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_CidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference()
	 * @model
	 * @generated
	 */
	String getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference <em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr With Acl Cidr software amazon awscdk services ec2 Acl Cidr As Reference</em>' attribute.
	 * @see #getCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference()
	 * @generated
	 */
	void setCidrWithAclCidr_software_amazon_awscdk_services_ec2_AclCidr_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Rule Number java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Number java lang Number </em>' attribute.
	 * @see #setRuleNumber_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_RuleNumber_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getRuleNumber_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getRuleNumber_java_lang_Number_ <em>Rule Number java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Number java lang Number </em>' attribute.
	 * @see #getRuleNumber_java_lang_Number_()
	 * @generated
	 */
	void setRuleNumber_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>' attribute.
	 * @see #setTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference(String)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_TrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference()
	 * @model
	 * @generated
	 */
	String getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference <em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic With Acl Traffic software amazon awscdk services ec2 Acl Traffic As Reference</em>' attribute.
	 * @see #getTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference()
	 * @generated
	 */
	void setTrafficWithAclTraffic_software_amazon_awscdk_services_ec2_AclTraffic_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Direction software amazon awscdk services ec2 Traffic Direction </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.TrafficDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction software amazon awscdk services ec2 Traffic Direction </em>' attribute.
	 * @see ec2.TrafficDirection
	 * @see #setDirection_software_amazon_awscdk_services_ec2_TrafficDirection_(TrafficDirection)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_Direction_software_amazon_awscdk_services_ec2_TrafficDirection_()
	 * @model dataType="ec2.TrafficDirection"
	 * @generated
	 */
	TrafficDirection getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_ <em>Direction software amazon awscdk services ec2 Traffic Direction </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction software amazon awscdk services ec2 Traffic Direction </em>' attribute.
	 * @see ec2.TrafficDirection
	 * @see #getDirection_software_amazon_awscdk_services_ec2_TrafficDirection_()
	 * @generated
	 */
	void setDirection_software_amazon_awscdk_services_ec2_TrafficDirection_(TrafficDirection value);

	/**
	 * Returns the value of the '<em><b>Network Acl Entry Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Acl Entry Name java lang String </em>' attribute.
	 * @see #setNetworkAclEntryName_java_lang_String_(String)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_NetworkAclEntryName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getNetworkAclEntryName_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getNetworkAclEntryName_java_lang_String_ <em>Network Acl Entry Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Acl Entry Name java lang String </em>' attribute.
	 * @see #getNetworkAclEntryName_java_lang_String_()
	 * @generated
	 */
	void setNetworkAclEntryName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Rule Action software amazon awscdk services ec2 Action </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Action software amazon awscdk services ec2 Action </em>' attribute.
	 * @see ec2.Action
	 * @see #setRuleAction_software_amazon_awscdk_services_ec2_Action_(Action)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_RuleAction_software_amazon_awscdk_services_ec2_Action_()
	 * @model dataType="ec2.Action"
	 * @generated
	 */
	Action getRuleAction_software_amazon_awscdk_services_ec2_Action_();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getRuleAction_software_amazon_awscdk_services_ec2_Action_ <em>Rule Action software amazon awscdk services ec2 Action </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Action software amazon awscdk services ec2 Action </em>' attribute.
	 * @see ec2.Action
	 * @see #getRuleAction_software_amazon_awscdk_services_ec2_Action_()
	 * @generated
	 */
	void setRuleAction_software_amazon_awscdk_services_ec2_Action_(Action value);

	/**
	 * Returns the value of the '<em><b>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>' attribute.
	 * @see #setNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(String)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_NetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @model
	 * @generated
	 */
	String getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference <em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Acl With INetwork Acl software amazon awscdk services ec2 INetwork Acl As Reference</em>' attribute.
	 * @see #getNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference()
	 * @generated
	 */
	void setNetworkAclWithINetworkAcl_software_amazon_awscdk_services_ec2_INetworkAcl_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.NetworkAclEntry"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.NetworkAclEntry" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see ec2.Ec2Package#getNetworkAclEntryBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.NetworkAclEntryBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // NetworkAclEntryBuilder_ec2
