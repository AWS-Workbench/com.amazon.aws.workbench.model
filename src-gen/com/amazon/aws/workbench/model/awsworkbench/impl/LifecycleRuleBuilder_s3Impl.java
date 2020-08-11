/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifecycle Rule Builder s3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getEnabled_java_lang_Boolean_ <em>Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Expiration With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getExpirationDateWithInstant_java_time_Instant_AsReference <em>Expiration Date With Instant java time Instant As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getId_java_lang_String_ <em>Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList <em>Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getPrefix_java_lang_String_ <em>Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getTagFilters_java_lang_String__java_lang_Object_AsMap <em>Tag Filters java lang String java lang Object As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getTransitions_software_amazon_awscdk_services_s3_Transition_AsList <em>Transitions software amazon awscdk services s3 Transition As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.LifecycleRuleBuilder_s3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifecycleRuleBuilder_s3Impl extends MinimalEObjectImpl.Container implements LifecycleRuleBuilder_s3 {
	/**
	 * The default value of the '{@link #getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference = ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnabled_java_lang_Boolean_() <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnabled_java_lang_Boolean_() <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean enabled_java_lang_Boolean_ = ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Expiration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Expiration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference = EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpirationDateWithInstant_java_time_Instant_AsReference() <em>Expiration Date With Instant java time Instant As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDateWithInstant_java_time_Instant_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpirationDateWithInstant_java_time_Instant_AsReference() <em>Expiration Date With Instant java time Instant As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDateWithInstant_java_time_Instant_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String expirationDateWithInstant_java_time_Instant_AsReference = EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId_java_lang_String_() <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_java_lang_String_() <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String id_java_lang_String_ = ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference() <em>Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference = NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList() <em>Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList() <em>Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList()
	 * @generated
	 * @ordered
	 */
	protected String noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList = NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix_java_lang_String_() <em>Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix_java_lang_String_() <em>Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String prefix_java_lang_String_ = PREFIX_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getTagFilters_java_lang_String__java_lang_Object_AsMap() <em>Tag Filters java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagFilters_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagFilters_java_lang_String__java_lang_Object_AsMap() <em>Tag Filters java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagFilters_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String tagFilters_java_lang_String__java_lang_Object_AsMap = TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransitions_software_amazon_awscdk_services_s3_Transition_AsList() <em>Transitions software amazon awscdk services s3 Transition As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions_software_amazon_awscdk_services_s3_Transition_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransitions_software_amazon_awscdk_services_s3_Transition_AsList() <em>Transitions software amazon awscdk services s3 Transition As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions_software_amazon_awscdk_services_s3_Transition_AsList()
	 * @generated
	 * @ordered
	 */
	protected String transitions_software_amazon_awscdk_services_s3_Transition_AsList = TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.s3.LifecycleRule";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifecycleRuleBuilder_s3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.LIFECYCLE_RULE_BUILDER_S3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference = abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference = newAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEnabled_java_lang_Boolean_() {
		return enabled_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled_java_lang_Boolean_(Boolean newEnabled_java_lang_Boolean_) {
		Boolean oldEnabled_java_lang_Boolean_ = enabled_java_lang_Boolean_;
		enabled_java_lang_Boolean_ = newEnabled_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ENABLED_JAVA_LANG_BOOLEAN_,
					oldEnabled_java_lang_Boolean_, enabled_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference = expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference = newExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpirationDateWithInstant_java_time_Instant_AsReference() {
		return expirationDateWithInstant_java_time_Instant_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationDateWithInstant_java_time_Instant_AsReference(
			String newExpirationDateWithInstant_java_time_Instant_AsReference) {
		String oldExpirationDateWithInstant_java_time_Instant_AsReference = expirationDateWithInstant_java_time_Instant_AsReference;
		expirationDateWithInstant_java_time_Instant_AsReference = newExpirationDateWithInstant_java_time_Instant_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE,
					oldExpirationDateWithInstant_java_time_Instant_AsReference,
					expirationDateWithInstant_java_time_Instant_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_java_lang_String_() {
		return id_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId_java_lang_String_(String newId_java_lang_String_) {
		String oldId_java_lang_String_ = id_java_lang_String_;
		id_java_lang_String_ = newId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_, oldId_java_lang_String_,
					id_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference() {
		return noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String newNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference) {
		String oldNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference = noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference = newNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE,
					oldNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference,
					noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList() {
		return noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList(
			String newNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList) {
		String oldNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList = noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList;
		noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList = newNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST,
					oldNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList,
					noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix_java_lang_String_() {
		return prefix_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix_java_lang_String_(String newPrefix_java_lang_String_) {
		String oldPrefix_java_lang_String_ = prefix_java_lang_String_;
		prefix_java_lang_String_ = newPrefix_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__PREFIX_JAVA_LANG_STRING_,
					oldPrefix_java_lang_String_, prefix_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTagFilters_java_lang_String__java_lang_Object_AsMap() {
		return tagFilters_java_lang_String__java_lang_Object_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagFilters_java_lang_String__java_lang_Object_AsMap(
			String newTagFilters_java_lang_String__java_lang_Object_AsMap) {
		String oldTagFilters_java_lang_String__java_lang_Object_AsMap = tagFilters_java_lang_String__java_lang_Object_AsMap;
		tagFilters_java_lang_String__java_lang_Object_AsMap = newTagFilters_java_lang_String__java_lang_Object_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
					oldTagFilters_java_lang_String__java_lang_Object_AsMap,
					tagFilters_java_lang_String__java_lang_Object_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransitions_software_amazon_awscdk_services_s3_Transition_AsList() {
		return transitions_software_amazon_awscdk_services_s3_Transition_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransitions_software_amazon_awscdk_services_s3_Transition_AsList(
			String newTransitions_software_amazon_awscdk_services_s3_Transition_AsList) {
		String oldTransitions_software_amazon_awscdk_services_s3_Transition_AsList = transitions_software_amazon_awscdk_services_s3_Transition_AsList;
		transitions_software_amazon_awscdk_services_s3_Transition_AsList = newTransitions_software_amazon_awscdk_services_s3_Transition_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST,
					oldTransitions_software_amazon_awscdk_services_s3_Transition_AsList,
					transitions_software_amazon_awscdk_services_s3_Transition_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ENABLED_JAVA_LANG_BOOLEAN_:
			return getEnabled_java_lang_Boolean_();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
			return getExpirationDateWithInstant_java_time_Instant_AsReference();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
			return getId_java_lang_String_();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST:
			return getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
			return getPrefix_java_lang_String_();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return getTagFilters_java_lang_String__java_lang_Object_AsMap();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST:
			return getTransitions_software_amazon_awscdk_services_s3_Transition_AsList();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ENABLED_JAVA_LANG_BOOLEAN_:
			setEnabled_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
			setExpirationDateWithInstant_java_time_Instant_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
			setId_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST:
			setNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList(
					(String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
			setPrefix_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setTagFilters_java_lang_String__java_lang_Object_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST:
			setTransitions_software_amazon_awscdk_services_s3_Transition_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ENABLED_JAVA_LANG_BOOLEAN_:
			setEnabled_java_lang_Boolean_(ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
			setExpirationDateWithInstant_java_time_Instant_AsReference(
					EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
			setId_java_lang_String_(ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			setNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(
					NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST:
			setNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList(
					NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
			setPrefix_java_lang_String_(PREFIX_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setTagFilters_java_lang_String__java_lang_Object_AsMap(
					TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST:
			setTransitions_software_amazon_awscdk_services_s3_Transition_AsList(
					TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !ABORT_INCOMPLETE_MULTIPART_UPLOAD_AFTER_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ENABLED_JAVA_LANG_BOOLEAN_:
			return ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT == null ? enabled_java_lang_Boolean_ != null
					: !ENABLED_JAVA_LANG_BOOLEAN__EDEFAULT.equals(enabled_java_lang_Boolean_);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE:
			return EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT == null
					? expirationDateWithInstant_java_time_Instant_AsReference != null
					: !EXPIRATION_DATE_WITH_INSTANT_JAVA_TIME_INSTANT_AS_REFERENCE_EDEFAULT
							.equals(expirationDateWithInstant_java_time_Instant_AsReference);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ID_JAVA_LANG_STRING_:
			return ID_JAVA_LANG_STRING__EDEFAULT == null ? id_java_lang_String_ != null
					: !ID_JAVA_LANG_STRING__EDEFAULT.equals(id_java_lang_String_);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE:
			return NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT == null
					? noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference != null
					: !NONCURRENT_VERSION_EXPIRATION_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE_EDEFAULT
							.equals(noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST:
			return NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST_EDEFAULT == null
					? noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList != null
					: !NONCURRENT_VERSION_TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_NONCURRENT_VERSION_TRANSITION_AS_LIST_EDEFAULT
							.equals(noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
			return PREFIX_JAVA_LANG_STRING__EDEFAULT == null ? prefix_java_lang_String_ != null
					: !PREFIX_JAVA_LANG_STRING__EDEFAULT.equals(prefix_java_lang_String_);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT == null
					? tagFilters_java_lang_String__java_lang_Object_AsMap != null
					: !TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT
							.equals(tagFilters_java_lang_String__java_lang_Object_AsMap);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST:
			return TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST_EDEFAULT == null
					? transitions_software_amazon_awscdk_services_s3_Transition_AsList != null
					: !TRANSITIONS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_TRANSITION_AS_LIST_EDEFAULT
							.equals(transitions_software_amazon_awscdk_services_s3_Transition_AsList);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.LIFECYCLE_RULE_BUILDER_S3__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(
				" (abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(abortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", enabled_java_lang_Boolean_: ");
		result.append(enabled_java_lang_Boolean_);
		result.append(", expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(expirationWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(", expirationDateWithInstant_java_time_Instant_AsReference: ");
		result.append(expirationDateWithInstant_java_time_Instant_AsReference);
		result.append(", id_java_lang_String_: ");
		result.append(id_java_lang_String_);
		result.append(", noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference: ");
		result.append(noncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference);
		result.append(
				", noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList: ");
		result.append(
				noncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList);
		result.append(", prefix_java_lang_String_: ");
		result.append(prefix_java_lang_String_);
		result.append(", tagFilters_java_lang_String__java_lang_Object_AsMap: ");
		result.append(tagFilters_java_lang_String__java_lang_Object_AsMap);
		result.append(", transitions_software_amazon_awscdk_services_s3_Transition_AsList: ");
		result.append(transitions_software_amazon_awscdk_services_s3_Transition_AsList);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //LifecycleRuleBuilder_s3Impl
