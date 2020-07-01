/**
 */
package com.amazon.aws.workbench.model.awsworkbench.builders.impl;

import com.amazon.aws.workbench.model.awsworkbench.builders.AppBuilder;
import com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage;
import com.amazon.aws.workbench.model.awsworkbench.builders.VpcBuilder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App Builder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getAutoSynth <em>Auto Synth</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getOutdir <em>Outdir</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getRuntimeInfo <em>Runtime Info</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getStackTraces <em>Stack Traces</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getTreeMetadata <em>Tree Metadata</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getAdditionalCode <em>Additional Code</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.builders.impl.AppBuilderImpl#getVpcbuilder <em>Vpcbuilder</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppBuilderImpl extends MinimalEObjectImpl.Container implements AppBuilder {
	/**
	 * The default value of the '{@link #getAutoSynth() <em>Auto Synth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSynth()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_SYNTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoSynth() <em>Auto Synth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoSynth()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoSynth = AUTO_SYNTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutdir() <em>Outdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTDIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutdir() <em>Outdir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutdir()
	 * @generated
	 * @ordered
	 */
	protected String outdir = OUTDIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntimeInfo() <em>Runtime Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RUNTIME_INFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntimeInfo() <em>Runtime Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInfo()
	 * @generated
	 * @ordered
	 */
	protected Boolean runtimeInfo = RUNTIME_INFO_EDEFAULT;

	/**
	 * The default value of the '{@link #getStackTraces() <em>Stack Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTraces()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean STACK_TRACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStackTraces() <em>Stack Traces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStackTraces()
	 * @generated
	 * @ordered
	 */
	protected Boolean stackTraces = STACK_TRACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreeMetadata() <em>Tree Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TREE_METADATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreeMetadata() <em>Tree Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeMetadata()
	 * @generated
	 * @ordered
	 */
	protected Boolean treeMetadata = TREE_METADATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.App";

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
	 * The cached value of the '{@link #getVpcbuilder() <em>Vpcbuilder</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcbuilder()
	 * @generated
	 * @ordered
	 */
	protected EList<VpcBuilder> vpcbuilder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildersPackage.Literals.APP_BUILDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoSynth() {
		return autoSynth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoSynth(Boolean newAutoSynth) {
		Boolean oldAutoSynth = autoSynth;
		autoSynth = newAutoSynth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__AUTO_SYNTH, oldAutoSynth,
					autoSynth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutdir() {
		return outdir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutdir(String newOutdir) {
		String oldOutdir = outdir;
		outdir = newOutdir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__OUTDIR, oldOutdir,
					outdir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRuntimeInfo() {
		return runtimeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntimeInfo(Boolean newRuntimeInfo) {
		Boolean oldRuntimeInfo = runtimeInfo;
		runtimeInfo = newRuntimeInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__RUNTIME_INFO,
					oldRuntimeInfo, runtimeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getStackTraces() {
		return stackTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStackTraces(Boolean newStackTraces) {
		Boolean oldStackTraces = stackTraces;
		stackTraces = newStackTraces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__STACK_TRACES,
					oldStackTraces, stackTraces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTreeMetadata() {
		return treeMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeMetadata(Boolean newTreeMetadata) {
		Boolean oldTreeMetadata = treeMetadata;
		treeMetadata = newTreeMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__TREE_METADATA,
					oldTreeMetadata, treeMetadata));
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
	public void setGeneratedClassName(String newGeneratedClassName) {
		String oldGeneratedClassName = generatedClassName;
		generatedClassName = newGeneratedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__GENERATED_CLASS_NAME,
					oldGeneratedClassName, generatedClassName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__VAR_NAME, oldVarName,
					varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__IDENTIFIER,
					oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BuildersPackage.APP_BUILDER__ADDITIONAL_CODE,
					oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VpcBuilder> getVpcbuilder() {
		if (vpcbuilder == null) {
			vpcbuilder = new EObjectContainmentEList<VpcBuilder>(VpcBuilder.class, this,
					BuildersPackage.APP_BUILDER__VPCBUILDER);
		}
		return vpcbuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BuildersPackage.APP_BUILDER__VPCBUILDER:
			return ((InternalEList<?>) getVpcbuilder()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BuildersPackage.APP_BUILDER__AUTO_SYNTH:
			return getAutoSynth();
		case BuildersPackage.APP_BUILDER__OUTDIR:
			return getOutdir();
		case BuildersPackage.APP_BUILDER__RUNTIME_INFO:
			return getRuntimeInfo();
		case BuildersPackage.APP_BUILDER__STACK_TRACES:
			return getStackTraces();
		case BuildersPackage.APP_BUILDER__TREE_METADATA:
			return getTreeMetadata();
		case BuildersPackage.APP_BUILDER__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case BuildersPackage.APP_BUILDER__VAR_NAME:
			return getVarName();
		case BuildersPackage.APP_BUILDER__IDENTIFIER:
			return getIdentifier();
		case BuildersPackage.APP_BUILDER__ADDITIONAL_CODE:
			return getAdditionalCode();
		case BuildersPackage.APP_BUILDER__VPCBUILDER:
			return getVpcbuilder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BuildersPackage.APP_BUILDER__AUTO_SYNTH:
			setAutoSynth((Boolean) newValue);
			return;
		case BuildersPackage.APP_BUILDER__OUTDIR:
			setOutdir((String) newValue);
			return;
		case BuildersPackage.APP_BUILDER__RUNTIME_INFO:
			setRuntimeInfo((Boolean) newValue);
			return;
		case BuildersPackage.APP_BUILDER__STACK_TRACES:
			setStackTraces((Boolean) newValue);
			return;
		case BuildersPackage.APP_BUILDER__TREE_METADATA:
			setTreeMetadata((Boolean) newValue);
			return;
		case BuildersPackage.APP_BUILDER__GENERATED_CLASS_NAME:
			setGeneratedClassName((String) newValue);
			return;
		case BuildersPackage.APP_BUILDER__VAR_NAME:
			setVarName((String) newValue);
			return;
		case BuildersPackage.APP_BUILDER__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case BuildersPackage.APP_BUILDER__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		case BuildersPackage.APP_BUILDER__VPCBUILDER:
			getVpcbuilder().clear();
			getVpcbuilder().addAll((Collection<? extends VpcBuilder>) newValue);
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
		case BuildersPackage.APP_BUILDER__AUTO_SYNTH:
			setAutoSynth(AUTO_SYNTH_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__OUTDIR:
			setOutdir(OUTDIR_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__RUNTIME_INFO:
			setRuntimeInfo(RUNTIME_INFO_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__STACK_TRACES:
			setStackTraces(STACK_TRACES_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__TREE_METADATA:
			setTreeMetadata(TREE_METADATA_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__GENERATED_CLASS_NAME:
			setGeneratedClassName(GENERATED_CLASS_NAME_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		case BuildersPackage.APP_BUILDER__VPCBUILDER:
			getVpcbuilder().clear();
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
		case BuildersPackage.APP_BUILDER__AUTO_SYNTH:
			return AUTO_SYNTH_EDEFAULT == null ? autoSynth != null : !AUTO_SYNTH_EDEFAULT.equals(autoSynth);
		case BuildersPackage.APP_BUILDER__OUTDIR:
			return OUTDIR_EDEFAULT == null ? outdir != null : !OUTDIR_EDEFAULT.equals(outdir);
		case BuildersPackage.APP_BUILDER__RUNTIME_INFO:
			return RUNTIME_INFO_EDEFAULT == null ? runtimeInfo != null : !RUNTIME_INFO_EDEFAULT.equals(runtimeInfo);
		case BuildersPackage.APP_BUILDER__STACK_TRACES:
			return STACK_TRACES_EDEFAULT == null ? stackTraces != null : !STACK_TRACES_EDEFAULT.equals(stackTraces);
		case BuildersPackage.APP_BUILDER__TREE_METADATA:
			return TREE_METADATA_EDEFAULT == null ? treeMetadata != null : !TREE_METADATA_EDEFAULT.equals(treeMetadata);
		case BuildersPackage.APP_BUILDER__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case BuildersPackage.APP_BUILDER__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case BuildersPackage.APP_BUILDER__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case BuildersPackage.APP_BUILDER__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		case BuildersPackage.APP_BUILDER__VPCBUILDER:
			return vpcbuilder != null && !vpcbuilder.isEmpty();
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
		result.append(" (autoSynth: ");
		result.append(autoSynth);
		result.append(", outdir: ");
		result.append(outdir);
		result.append(", runtimeInfo: ");
		result.append(runtimeInfo);
		result.append(", stackTraces: ");
		result.append(stackTraces);
		result.append(", treeMetadata: ");
		result.append(treeMetadata);
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

} //AppBuilderImpl
