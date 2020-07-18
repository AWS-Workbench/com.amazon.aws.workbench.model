/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acl Traffic Config Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.AclTrafficConfigBuilder_ec2#getProtocol_java_lang_Number_ <em>Protocol java lang Number </em>}</li>
 *   <li>{@link ec2.AclTrafficConfigBuilder_ec2#getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference <em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>}</li>
 *   <li>{@link ec2.AclTrafficConfigBuilder_ec2#getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference <em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>}</li>
 *   <li>{@link ec2.AclTrafficConfigBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.AclTrafficConfigBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.AclTrafficConfigBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.AclTrafficConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getAclTrafficConfigBuilder_ec2()
 * @model
 * @generated
 */
public interface AclTrafficConfigBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol java lang Number </em>' attribute.
	 * @see #setProtocol_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getAclTrafficConfigBuilder_ec2_Protocol_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getProtocol_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.AclTrafficConfigBuilder_ec2#getProtocol_java_lang_Number_ <em>Protocol java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol java lang Number </em>' attribute.
	 * @see #getProtocol_java_lang_Number_()
	 * @generated
	 */
	void setProtocol_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>' attribute.
	 * @see #setIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference(String)
	 * @see ec2.Ec2Package#getAclTrafficConfigBuilder_ec2_IcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference()
	 * @model
	 * @generated
	 */
	String getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference();

	/**
	 * Sets the value of the '{@link ec2.AclTrafficConfigBuilder_ec2#getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference <em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icmp With Acl Icmp software amazon awscdk services ec2 Acl Icmp As Reference</em>' attribute.
	 * @see #getIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference()
	 * @generated
	 */
	void setIcmpWithAclIcmp_software_amazon_awscdk_services_ec2_AclIcmp_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>' attribute.
	 * @see #setPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference(String)
	 * @see ec2.Ec2Package#getAclTrafficConfigBuilder_ec2_PortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference()
	 * @model
	 * @generated
	 */
	String getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference();

	/**
	 * Sets the value of the '{@link ec2.AclTrafficConfigBuilder_ec2#getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference <em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Range With Acl Port Range software amazon awscdk services ec2 Acl Port Range As Reference</em>' attribute.
	 * @see #getPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference()
	 * @generated
	 */
	void setPortRangeWithAclPortRange_software_amazon_awscdk_services_ec2_AclPortRange_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.AclTrafficConfig"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getAclTrafficConfigBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.AclTrafficConfig" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getAclTrafficConfigBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.AclTrafficConfigBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getAclTrafficConfigBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.AclTrafficConfigBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getAclTrafficConfigBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.AclTrafficConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AclTrafficConfigBuilder_ec2
