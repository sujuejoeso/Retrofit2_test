package com.joeso.retrofit2test;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class User implements Serializable {

    @SerializedName("is_new_account")
    Boolean isNewAccount;
    @SerializedName("un_read_notification_counts")
    Integer unread_notification;
    @SerializedName("id")
    Integer id;
    @SerializedName("email")
    String email;
    @SerializedName("first_name")
    String firstName;
    @SerializedName("last_name")
    String lastName;
    @SerializedName("created_at")
    String createdAt;
    @SerializedName("updated_at")
    String updateAt;
    @SerializedName("phone")
    String phone;
    @SerializedName("sign_up_date")
    String signUpDate;
    @SerializedName("gender")
    String gender;
    @SerializedName("date_of_birth")
    String dateOfBirth;
    @SerializedName("referral_code")
    String referralCode;
    @SerializedName("referral_by_code")
    String referralByCode;
    @SerializedName("payment_status")
    String paymentStatus;
    @SerializedName("emergency_contact_name")
    String emergencyContactName;
    @SerializedName("emergency_contact_number")
    String emergencyContactNumber;
    @SerializedName("emergency_contact_relation")
    String emergencyContactRelation;
    @SerializedName("status")
    String status;
    @SerializedName("has_redeemed_free_session")
    Boolean has_redeemed_free_session;
    @SerializedName("access_token")
    String accessToken;
    @SerializedName("profile_picture_url")
    String portrait;
    @SerializedName("location_id")
    Integer currentLocation;
    @SerializedName("finished_location_tutorial")
    Boolean finishedLocationTutorial;
    @SerializedName("earned_free_weeks")
    Integer earnedFreeWeeks;
    @SerializedName("cancellation_date")
    String cancellationDate;
    @SerializedName("membership_since")
    String membershipSince;
    @SerializedName("transferring_location_id")
    Integer transferringLocationId;

    //undefined variables
    @SerializedName("tutorial_finished_at")
    String tutorialFinishedAt;

    public Token token;

    public static class Token implements Serializable {
        private String accessToken;
        private String tokenType;
        private String client;
        private String expiry;
        private String uid;
        public String getAccessToken() {
            return accessToken;
        }
        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }
        public String getTokenType() {
            return tokenType;
        }
        public void setTokenType(String tokenType) {
            this.tokenType = tokenType;
        }
        public String getClient() {
            return client;
        }
        public void setClient(String client) {
            this.client = client;
        }
        public String getExpiry() {
            return expiry;
        }
        public void setExpiry(String expiry) {
            this.expiry = expiry;
        }
        public String getUid() {
            return uid;
        }
        public void setUid(String uid) {
            this.uid = uid;
        }
    }



    public User() {
    }

    public User(User preUser) {
        this.id = preUser.getId();
        this.firstName = preUser.getFirstName();
        this.lastName = preUser.getLastName();
        this.dateOfBirth = preUser.getDateOfBirth();
        this.accessToken = preUser.getAccessToken();
        this.gender = preUser.getAccessToken();
        this.email = preUser.getEmail();
        this.tutorialFinishedAt = preUser.getTutorialFinishedAt();
        this.portrait = preUser.getPortrait();
        this.membershipSince = preUser.getMembershipSince();
        this.referralCode = preUser.getReferralCode();
        this.createdAt = preUser.getCreatedAt();
        this.updateAt = preUser.getUpdateAt();
        this.status = preUser.getStatus();
        this.has_redeemed_free_session = preUser.getHas_redeemed_free_session();
        this.emergencyContactName = preUser.getEmergencyContactName();
        this.emergencyContactNumber = preUser.getEmergencyContactNumber();
        this.paymentStatus = preUser.getPaymentStatus();
        this.phone = preUser.getPhone();
        this.referralByCode = preUser.getReferralByCode();
        this.signUpDate = preUser.getSignUpDate();
        this.currentLocation = preUser.getCurrentLocation();
        this.cancellationDate = preUser.getCancellationDate();
    }

    public Integer getId() {
        return id;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getPortrait() {
        return portrait;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMembershipSince() {
        if (membershipSince != null) {
            try {
                return "Membership since " + (new SimpleDateFormat("MMM yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(membershipSince))).toString();
            } catch (ParseException e) {
            }
        }
        return membershipSince;
    }


    public String getReferralCode() {
        return referralCode;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        String temp = "";
        if (!TextUtils.isEmpty(gender)) {
            temp = gender.substring(0, 1).toUpperCase() + gender.substring(1);
        }
        return temp;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTutorialFinishedAt() {
        return tutorialFinishedAt;
    }


    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getPhone() {
        return phone;
    }

    public String getReferralByCode() {
        return referralByCode;
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public Boolean getHas_redeemed_free_session() {
        return has_redeemed_free_session;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public String getStatus() {
        return status;
    }

    public Integer getCurrentLocation() {
        return currentLocation;
    }

    public Boolean getNewAccount() {
        return isNewAccount;
    }

    public Boolean getFinishedLocationTutorial() {
        return finishedLocationTutorial;
    }

    public Integer getUnread_notification() {
        return unread_notification;
    }

    public void setUnread_notification(Integer unread_notification) {
        this.unread_notification = unread_notification;
    }

    public void setFinishedLocationTutorial(Boolean finishedLocationTutorial) {
        this.finishedLocationTutorial = finishedLocationTutorial;
    }

    public void setNewAccount(Boolean newAccount) {
        isNewAccount = newAccount;
    }

    public void setCurrentLocation(int currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Integer getEarnedFreeWeeks() {
        return earnedFreeWeeks;
    }

    public void setEarnedFreeWeeks(Integer earnedFreeWeeks) {
        this.earnedFreeWeeks = earnedFreeWeeks;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTutorialFinishedAt(String tutorialFinishedAt) {
        this.tutorialFinishedAt = tutorialFinishedAt;
    }

    public void setMembershipSince(String membershipSince) {
        this.membershipSince = membershipSince;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }


    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public void setReferralByCode(String referralByCode) {
        this.referralByCode = referralByCode;
    }

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public void setHas_redeemed_free_session(Boolean has_redeemed_free_session) {
        this.has_redeemed_free_session = has_redeemed_free_session;
    }

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public Integer getTransferringLocationId() {
        return transferringLocationId;
    }

    public void setTransferringLocationId(Integer transferringLocationId) {
        this.transferringLocationId = transferringLocationId;
    }

    public void setCurrentLocation(Integer currentLocation) {
        this.currentLocation = currentLocation;
    }
}

