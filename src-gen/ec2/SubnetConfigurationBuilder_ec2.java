/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnet Configuration Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.SubnetConfigurationBuilder_ec2#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link ec2.SubnetConfigurationBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}</li>
 *   <li>{@link ec2.SubnetConfigurationBuilder_ec2#getCidrMask_java_lang_Number_ <em>Cidr Mask java lang Number </em>}</li>
 *   <li>{@link ec2.SubnetConfigurationBuilder_ec2#getReserved_java_lang_Boolean_ <em>Reserved java lang Boolean </em>}</li>
 *   <li>{@link ec2.SubnetConfigurationBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.SubnetConfigurationBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.SubnetConfigurationBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.SubnetConfigurationBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2()
 * @model
 * @generated
 */
public interface SubnetConfigurationBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name java lang String </em>' attribute.
	 * @see #setName_java_lang_String_(String)
	 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2_Name_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getName_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.SubnetConfigurationBuilder_ec2#getName_java_lang_String_ <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name java lang String </em>' attribute.
	 * @see #getName_java_lang_String_()
	 * @generated
	 */
	void setName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Subnet Type software amazon awscdk services ec2 Subnet Type </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.SubnetType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>' attribute.
	 * @see ec2.SubnetType
	 * @see #setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_(SubnetType)
	 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2_SubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @model dataType="ec2.SubnetType"
	 * @generated
	 */
	SubnetType getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_();

	/**
	 * Sets the value of the '{@link ec2.SubnetConfigurationBuilder_ec2#getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_ <em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet Type software amazon awscdk services ec2 Subnet Type </em>' attribute.
	 * @see ec2.SubnetType
	 * @see #getSubnetType_software_amazon_awscdk_services_ec2_SubnetType_()
	 * @generated
	 */
	void setSubnetType_software_amazon_awscdk_services_ec2_SubnetType_(SubnetType value);

	/**
	 * Returns the value of the '<em><b>Cidr Mask java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr Mask java lang Number </em>' attribute.
	 * @see #setCidrMask_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2_CidrMask_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getCidrMask_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.SubnetConfigurationBuilder_ec2#getCidrMask_java_lang_Number_ <em>Cidr Mask java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr Mask java lang Number </em>' attribute.
	 * @see #getCidrMask_java_lang_Number_()
	 * @generated
	 */
	void setCidrMask_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Reserved java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved java lang Boolean </em>' attribute.
	 * @see #setReserved_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2_Reserved_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getReserved_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.SubnetConfigurationBuilder_ec2#getReserved_java_lang_Boolean_ <em>Reserved java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved java lang Boolean </em>' attribute.
	 * @see #getReserved_java_lang_Boolean_()
	 * @generated
	 */
	void setReserved_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.SubnetConfiguration"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.SubnetConfiguration" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.SubnetConfigurationBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.SubnetConfigurationBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getSubnetConfigurationBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.SubnetConfigurationBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SubnetConfigurationBuilder_ec2
