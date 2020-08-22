/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.Block;
import com.amazon.aws.workbench.model.awsworkbench.ServiceResources;

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
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockImpl#isIsDraft <em>Is Draft</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockImpl#getBlockresources <em>Blockresources</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BlockImpl#getSubblocks <em>Subblocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDraft() <em>Is Draft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDraft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DRAFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDraft() <em>Is Draft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDraft()
	 * @generated
	 * @ordered
	 */
	protected boolean isDraft = IS_DRAFT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBlockresources() <em>Blockresources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockresources()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceResources> blockresources;

	/**
	 * The cached value of the '{@link #getSubblocks() <em>Subblocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubblocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> subblocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.BLOCK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.BLOCK__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.BLOCK__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDraft() {
		return isDraft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDraft(boolean newIsDraft) {
		boolean oldIsDraft = isDraft;
		isDraft = newIsDraft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.BLOCK__IS_DRAFT, oldIsDraft,
					isDraft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServiceResources> getBlockresources() {
		if (blockresources == null) {
			blockresources = new EObjectContainmentEList<ServiceResources>(ServiceResources.class, this,
					AwsworkbenchPackage.BLOCK__BLOCKRESOURCES);
		}
		return blockresources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Block> getSubblocks() {
		if (subblocks == null) {
			subblocks = new EObjectContainmentEList<Block>(Block.class, this, AwsworkbenchPackage.BLOCK__SUBBLOCKS);
		}
		return subblocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AwsworkbenchPackage.BLOCK__BLOCKRESOURCES:
			return ((InternalEList<?>) getBlockresources()).basicRemove(otherEnd, msgs);
		case AwsworkbenchPackage.BLOCK__SUBBLOCKS:
			return ((InternalEList<?>) getSubblocks()).basicRemove(otherEnd, msgs);
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
		case AwsworkbenchPackage.BLOCK__LABEL:
			return getLabel();
		case AwsworkbenchPackage.BLOCK__DESCRIPTION:
			return getDescription();
		case AwsworkbenchPackage.BLOCK__NOTES:
			return getNotes();
		case AwsworkbenchPackage.BLOCK__IS_DRAFT:
			return isIsDraft();
		case AwsworkbenchPackage.BLOCK__BLOCKRESOURCES:
			return getBlockresources();
		case AwsworkbenchPackage.BLOCK__SUBBLOCKS:
			return getSubblocks();
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
		case AwsworkbenchPackage.BLOCK__LABEL:
			setLabel((String) newValue);
			return;
		case AwsworkbenchPackage.BLOCK__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case AwsworkbenchPackage.BLOCK__NOTES:
			setNotes((String) newValue);
			return;
		case AwsworkbenchPackage.BLOCK__IS_DRAFT:
			setIsDraft((Boolean) newValue);
			return;
		case AwsworkbenchPackage.BLOCK__BLOCKRESOURCES:
			getBlockresources().clear();
			getBlockresources().addAll((Collection<? extends ServiceResources>) newValue);
			return;
		case AwsworkbenchPackage.BLOCK__SUBBLOCKS:
			getSubblocks().clear();
			getSubblocks().addAll((Collection<? extends Block>) newValue);
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
		case AwsworkbenchPackage.BLOCK__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK__NOTES:
			setNotes(NOTES_EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK__IS_DRAFT:
			setIsDraft(IS_DRAFT_EDEFAULT);
			return;
		case AwsworkbenchPackage.BLOCK__BLOCKRESOURCES:
			getBlockresources().clear();
			return;
		case AwsworkbenchPackage.BLOCK__SUBBLOCKS:
			getSubblocks().clear();
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
		case AwsworkbenchPackage.BLOCK__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case AwsworkbenchPackage.BLOCK__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case AwsworkbenchPackage.BLOCK__NOTES:
			return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
		case AwsworkbenchPackage.BLOCK__IS_DRAFT:
			return isDraft != IS_DRAFT_EDEFAULT;
		case AwsworkbenchPackage.BLOCK__BLOCKRESOURCES:
			return blockresources != null && !blockresources.isEmpty();
		case AwsworkbenchPackage.BLOCK__SUBBLOCKS:
			return subblocks != null && !subblocks.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(", description: ");
		result.append(description);
		result.append(", notes: ");
		result.append(notes);
		result.append(", isDraft: ");
		result.append(isDraft);
		result.append(')');
		return result.toString();
	}

} //BlockImpl
