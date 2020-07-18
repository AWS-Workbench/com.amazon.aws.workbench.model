/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Device Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.BlockDeviceBuilder_ec2#getDeviceName_java_lang_String_ <em>Device Name java lang String </em>}</li>
 *   <li>{@link ec2.BlockDeviceBuilder_ec2#getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference <em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>}</li>
 *   <li>{@link ec2.BlockDeviceBuilder_ec2#getMappingEnabled_java_lang_Boolean_ <em>Mapping Enabled java lang Boolean </em>}</li>
 *   <li>{@link ec2.BlockDeviceBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.BlockDeviceBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.BlockDeviceBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.BlockDeviceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getBlockDeviceBuilder_ec2()
 * @model
 * @generated
 */
public interface BlockDeviceBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Device Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name java lang String </em>' attribute.
	 * @see #setDeviceName_java_lang_String_(String)
	 * @see ec2.Ec2Package#getBlockDeviceBuilder_ec2_DeviceName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDeviceName_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.BlockDeviceBuilder_ec2#getDeviceName_java_lang_String_ <em>Device Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name java lang String </em>' attribute.
	 * @see #getDeviceName_java_lang_String_()
	 * @generated
	 */
	void setDeviceName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>' attribute.
	 * @see #setVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference(String)
	 * @see ec2.Ec2Package#getBlockDeviceBuilder_ec2_VolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference()
	 * @model
	 * @generated
	 */
	String getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference();

	/**
	 * Sets the value of the '{@link ec2.BlockDeviceBuilder_ec2#getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference <em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume With Block Device Volume software amazon awscdk services ec2 Block Device Volume As Reference</em>' attribute.
	 * @see #getVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference()
	 * @generated
	 */
	void setVolumeWithBlockDeviceVolume_software_amazon_awscdk_services_ec2_BlockDeviceVolume_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Mapping Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Enabled java lang Boolean </em>' attribute.
	 * @see #setMappingEnabled_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getBlockDeviceBuilder_ec2_MappingEnabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getMappingEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.BlockDeviceBuilder_ec2#getMappingEnabled_java_lang_Boolean_ <em>Mapping Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Enabled java lang Boolean </em>' attribute.
	 * @see #getMappingEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setMappingEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.BlockDevice"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getBlockDeviceBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.BlockDevice" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getBlockDeviceBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.BlockDeviceBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getBlockDeviceBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.BlockDeviceBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getBlockDeviceBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.BlockDeviceBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // BlockDeviceBuilder_ec2
