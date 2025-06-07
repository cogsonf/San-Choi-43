package com.example.SanChoi247.model.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerPairingForm {
    @Valid
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Tên không được để trống")
    private String name;
    @NotNull(message = "Tuổi không được để trống")
    @Min(value = 1, message = "Tuổi phải lớn hơn 0")
    private Integer age;
    @NotBlank(message = "Số điện thoại không được để trống")
    private String phone;
    @Email(message = "Email không hợp lệ")
    @NotBlank(message = "Email không được để trống")
    private String email;
    @NotBlank(message = "Giới tính không được để trống")
    private String gender;
    @NotBlank(message = "Môn thể thao không được để trống")
    private String sport;
    @NotBlank(message = "Chế độ chơi không được để trống")
    private String mode;
    private String level;
    private String goal;
    @Column(name = "time_frame")
    @Pattern(regexp = "^\\d{4}-(?:0[1-9]|1[0-2])-(?:0[1-9]|[12]\\d|3[01]) (?:[01]\\d|2[0-3]):[0-5]\\d-\\d{4}-(?:0[1-9]|1[0-2])-(?:0[1-9]|[12]\\d|3[01]) (?:[01]\\d|2[0-3]):[0-5]\\d$", message = "Thời gian phải có định dạng YYYY-MM-DD HH:mm-YYYY-MM-DD HH:mm")
    private String timeFrame;
    @NotBlank(message = "Khu vực không được để trống")
    private String location;

    private String playType;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "team_members")
    private String teamMembers;
    @Column(name = "uid")
    private Integer uid;
    @Column(name = "status")
    private String status;
    @Column(name = "matched_with")
    private Integer matchedWith;
    @Column(name = "cancel_reason")
    private String cancelReason;
}