/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Image Config Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.MachineImageConfigBuilder_ec2#getImageId_java_lang_String_ <em>Image Id java lang String </em>}</li>
 *   <li>{@link ec2.MachineImageConfigBuilder_ec2#getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_ <em>Os Type software amazon awscdk services ec2 Operating System Type </em>}</li>
 *   <li>{@link ec2.MachineImageConfigBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}</li>
 *   <li>{@link ec2.MachineImageConfigBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.MachineImageConfigBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.MachineImageConfigBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.MachineImageConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getMachineImageConfigBuilder_ec2()
 * @model
 * @generated
 */
public interface MachineImageConfigBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Id java lang String </em>' attribute.
	 * @see #setImageId_java_lang_String_(String)
	 * @see ec2.Ec2Package#getMachineImageConfigBuilder_ec2_ImageId_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getImageId_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.MachineImageConfigBuilder_ec2#getImageId_java_lang_String_ <em>Image Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id java lang String </em>' attribute.
	 * @see #getImageId_java_lang_String_()
	 * @generated
	 */
	void setImageId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Os Type software amazon awscdk services ec2 Operating System Type </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.OperatingSystemType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Type software amazon awscdk services ec2 Operating System Type </em>' attribute.
	 * @see ec2.OperatingSystemType
	 * @see #setOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_(OperatingSystemType)
	 * @see ec2.Ec2Package#getMachineImageConfigBuilder_ec2_OsType_software_amazon_awscdk_services_ec2_OperatingSystemType_()
	 * @model dataType="ec2.OperatingSystemType"
	 * @generated
	 */
	OperatingSystemType getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_();

	/**
	 * Sets the value of the '{@link ec2.MachineImageConfigBuilder_ec2#getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_ <em>Os Type software amazon awscdk services ec2 Operating System Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Type software amazon awscdk services ec2 Operating System Type </em>' attribute.
	 * @see ec2.OperatingSystemType
	 * @see #getOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_()
	 * @generated
	 */
	void setOsType_software_amazon_awscdk_services_ec2_OperatingSystemType_(OperatingSystemType value);

	/**
	 * Returns the value of the '<em><b>User Data With User Data software amazon awscdk services ec2 User Data As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>' attribute.
	 * @see #setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(String)
	 * @see ec2.Ec2Package#getMachineImageConfigBuilder_ec2_UserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @model
	 * @generated
	 */
	String getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();

	/**
	 * Sets the value of the '{@link ec2.MachineImageConfigBuilder_ec2#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>' attribute.
	 * @see #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @generated
	 */
	void setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.MachineImageConfig"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getMachineImageConfigBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.MachineImageConfig" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getMachineImageConfigBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.MachineImageConfigBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getMachineImageConfigBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.MachineImageConfigBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getMachineImageConfigBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.MachineImageConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // MachineImageConfigBuilder_ec2
