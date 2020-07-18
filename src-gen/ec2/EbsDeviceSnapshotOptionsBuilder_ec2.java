/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ebs Device Snapshot Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVolumeSize_java_lang_Number_ <em>Volume Size java lang Number </em>}</li>
 *   <li>{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_ <em>Delete On Termination java lang Boolean </em>}</li>
 *   <li>{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getIops_java_lang_Number_ <em>Iops java lang Number </em>}</li>
 *   <li>{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}</li>
 *   <li>{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2()
 * @model
 * @generated
 */
public interface EbsDeviceSnapshotOptionsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Volume Size java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Size java lang Number </em>' attribute.
	 * @see #setVolumeSize_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeSize_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getVolumeSize_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVolumeSize_java_lang_Number_ <em>Volume Size java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Size java lang Number </em>' attribute.
	 * @see #getVolumeSize_java_lang_Number_()
	 * @generated
	 */
	void setVolumeSize_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Delete On Termination java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete On Termination java lang Boolean </em>' attribute.
	 * @see #setDeleteOnTermination_java_lang_Boolean_(Boolean)
	 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2_DeleteOnTermination_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeleteOnTermination_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getDeleteOnTermination_java_lang_Boolean_ <em>Delete On Termination java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete On Termination java lang Boolean </em>' attribute.
	 * @see #getDeleteOnTermination_java_lang_Boolean_()
	 * @generated
	 */
	void setDeleteOnTermination_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Iops java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iops java lang Number </em>' attribute.
	 * @see #setIops_java_lang_Number_(int)
	 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2_Iops_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getIops_java_lang_Number_();

	/**
	 * Sets the value of the '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getIops_java_lang_Number_ <em>Iops java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iops java lang Number </em>' attribute.
	 * @see #getIops_java_lang_Number_()
	 * @generated
	 */
	void setIops_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.EbsDeviceVolumeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>' attribute.
	 * @see ec2.EbsDeviceVolumeType
	 * @see #setVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_(EbsDeviceVolumeType)
	 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2_VolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_()
	 * @model dataType="ec2.EbsDeviceVolumeType"
	 * @generated
	 */
	EbsDeviceVolumeType getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_();

	/**
	 * Sets the value of the '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_ <em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Type software amazon awscdk services ec2 Ebs Device Volume Type </em>' attribute.
	 * @see ec2.EbsDeviceVolumeType
	 * @see #getVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_()
	 * @generated
	 */
	void setVolumeType_software_amazon_awscdk_services_ec2_EbsDeviceVolumeType_(EbsDeviceVolumeType value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.EbsDeviceSnapshotOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getEbsDeviceSnapshotOptionsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.EbsDeviceSnapshotOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // EbsDeviceSnapshotOptionsBuilder_ec2
