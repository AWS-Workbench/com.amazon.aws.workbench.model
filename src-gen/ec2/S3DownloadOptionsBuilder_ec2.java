/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S3 Download Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.S3DownloadOptionsBuilder_ec2#getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link ec2.S3DownloadOptionsBuilder_ec2#getBucketKey_java_lang_String_ <em>Bucket Key java lang String </em>}</li>
 *   <li>{@link ec2.S3DownloadOptionsBuilder_ec2#getLocalFile_java_lang_String_ <em>Local File java lang String </em>}</li>
 *   <li>{@link ec2.S3DownloadOptionsBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.S3DownloadOptionsBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.S3DownloadOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.S3DownloadOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getS3DownloadOptionsBuilder_ec2()
 * @model
 * @generated
 */
public interface S3DownloadOptionsBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #setBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String)
	 * @see ec2.Ec2Package#getS3DownloadOptionsBuilder_ec2_BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @model
	 * @generated
	 */
	String getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

	/**
	 * Sets the value of the '{@link ec2.S3DownloadOptionsBuilder_ec2#getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 */
	void setBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Bucket Key java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Key java lang String </em>' attribute.
	 * @see #setBucketKey_java_lang_String_(String)
	 * @see ec2.Ec2Package#getS3DownloadOptionsBuilder_ec2_BucketKey_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getBucketKey_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.S3DownloadOptionsBuilder_ec2#getBucketKey_java_lang_String_ <em>Bucket Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Key java lang String </em>' attribute.
	 * @see #getBucketKey_java_lang_String_()
	 * @generated
	 */
	void setBucketKey_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Local File java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local File java lang String </em>' attribute.
	 * @see #setLocalFile_java_lang_String_(String)
	 * @see ec2.Ec2Package#getS3DownloadOptionsBuilder_ec2_LocalFile_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getLocalFile_java_lang_String_();

	/**
	 * Sets the value of the '{@link ec2.S3DownloadOptionsBuilder_ec2#getLocalFile_java_lang_String_ <em>Local File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local File java lang String </em>' attribute.
	 * @see #getLocalFile_java_lang_String_()
	 * @generated
	 */
	void setLocalFile_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.S3DownloadOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getS3DownloadOptionsBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.S3DownloadOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getS3DownloadOptionsBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.S3DownloadOptionsBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getS3DownloadOptionsBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.S3DownloadOptionsBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getS3DownloadOptionsBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.S3DownloadOptionsBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // S3DownloadOptionsBuilder_ec2