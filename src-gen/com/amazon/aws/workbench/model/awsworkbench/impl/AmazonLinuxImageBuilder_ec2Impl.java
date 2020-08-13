/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxEdition;
import com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxGeneration;
import com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxImageBuilder_ec2;
import com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxStorage;
import com.amazon.aws.workbench.model.awsworkbench.AmazonLinuxVirt;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amazon Linux Image Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ <em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ <em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ <em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ <em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AmazonLinuxImageBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmazonLinuxImageBuilder_ec2Impl extends ServiceResourcesImpl implements AmazonLinuxImageBuilder_ec2 {
	/**
	 * The default value of the '{@link #getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_() <em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_()
	 * @generated
	 * @ordered
	 */
	protected static final AmazonLinuxEdition EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION__EDEFAULT = AmazonLinuxEdition.STANDARD;

	/**
	 * The cached value of the '{@link #getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_() <em>Edition software amazon awscdk services ec2 Amazon Linux Edition </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_()
	 * @generated
	 * @ordered
	 */
	protected AmazonLinuxEdition edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ = EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_() <em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_()
	 * @generated
	 * @ordered
	 */
	protected static final AmazonLinuxGeneration GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION__EDEFAULT = AmazonLinuxGeneration.AMAZON_LINUX;

	/**
	 * The cached value of the '{@link #getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_() <em>Generation software amazon awscdk services ec2 Amazon Linux Generation </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_()
	 * @generated
	 * @ordered
	 */
	protected AmazonLinuxGeneration generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ = GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION__EDEFAULT;

	/**
	 * The default value of the '{@link #getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_() <em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_()
	 * @generated
	 * @ordered
	 */
	protected static final AmazonLinuxStorage STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE__EDEFAULT = AmazonLinuxStorage.EBS;

	/**
	 * The cached value of the '{@link #getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_() <em>Storage software amazon awscdk services ec2 Amazon Linux Storage </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_()
	 * @generated
	 * @ordered
	 */
	protected AmazonLinuxStorage storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ = STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE__EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() <em>User Data With User Data software amazon awscdk services ec2 User Data As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference = USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_() <em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_()
	 * @generated
	 * @ordered
	 */
	protected static final AmazonLinuxVirt VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT__EDEFAULT = AmazonLinuxVirt.HVM;

	/**
	 * The cached value of the '{@link #getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_() <em>Virtualization software amazon awscdk services ec2 Amazon Linux Virt </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_()
	 * @generated
	 * @ordered
	 */
	protected AmazonLinuxVirt virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ = VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.AmazonLinuxImage";

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
	protected AmazonLinuxImageBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.AMAZON_LINUX_IMAGE_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonLinuxEdition getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_() {
		return edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_(
			AmazonLinuxEdition newEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_) {
		AmazonLinuxEdition oldEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ = edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_;
		edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ = newEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ == null
				? EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION__EDEFAULT
				: newEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_,
					oldEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_,
					edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonLinuxGeneration getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_() {
		return generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_(
			AmazonLinuxGeneration newGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_) {
		AmazonLinuxGeneration oldGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ = generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_;
		generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ = newGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ == null
				? GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION__EDEFAULT
				: newGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_,
					oldGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_,
					generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonLinuxStorage getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_() {
		return storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_(
			AmazonLinuxStorage newStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_) {
		AmazonLinuxStorage oldStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ = storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_;
		storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ = newStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ == null
				? STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE__EDEFAULT
				: newStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_,
					oldStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_,
					storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference() {
		return userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(
			String newUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference) {
		String oldUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference = userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference;
		userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference = newUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE,
					oldUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference,
					userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmazonLinuxVirt getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_() {
		return virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_(
			AmazonLinuxVirt newVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_) {
		AmazonLinuxVirt oldVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ = virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_;
		virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ = newVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ == null
				? VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT__EDEFAULT
				: newVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_,
					oldVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_,
					virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_));
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
					AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_:
			return getEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_:
			return getGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_:
			return getStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			return getUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_:
			return getVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_:
			setEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_((AmazonLinuxEdition) newValue);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_:
			setGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_((AmazonLinuxGeneration) newValue);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_:
			setStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_((AmazonLinuxStorage) newValue);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_:
			setVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_((AmazonLinuxVirt) newValue);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_:
			setEdition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_(
					EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION__EDEFAULT);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_:
			setGeneration_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_(
					GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION__EDEFAULT);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_:
			setStorage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_(
					STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE__EDEFAULT);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			setUserDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference(
					USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_:
			setVirtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_(
					VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT__EDEFAULT);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION_:
			return edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_ != EDITION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_EDITION__EDEFAULT;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION_:
			return generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_ != GENERATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_GENERATION__EDEFAULT;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE_:
			return storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_ != STORAGE_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_STORAGE__EDEFAULT;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE:
			return USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT == null
					? userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference != null
					: !USER_DATA_WITH_USER_DATA_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_USER_DATA_AS_REFERENCE_EDEFAULT
							.equals(userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference);
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT_:
			return virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_ != VIRTUALIZATION_SOFTWARE_AMAZON_AWSCDK_SERVICES_EC2_AMAZON_LINUX_VIRT__EDEFAULT;
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.AMAZON_LINUX_IMAGE_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_: ");
		result.append(edition_software_amazon_awscdk_services_ec2_AmazonLinuxEdition_);
		result.append(", generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_: ");
		result.append(generation_software_amazon_awscdk_services_ec2_AmazonLinuxGeneration_);
		result.append(", storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_: ");
		result.append(storage_software_amazon_awscdk_services_ec2_AmazonLinuxStorage_);
		result.append(", userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference: ");
		result.append(userDataWithUserData_software_amazon_awscdk_services_ec2_UserData_AsReference);
		result.append(", virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_: ");
		result.append(virtualization_software_amazon_awscdk_services_ec2_AmazonLinuxVirt_);
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

} //AmazonLinuxImageBuilder_ec2Impl
