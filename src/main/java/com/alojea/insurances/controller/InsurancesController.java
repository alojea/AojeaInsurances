package com.alojea.insurances.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alojea.insurances.models.Member;
import com.alojea.insurances.repositories.MemberRepository;

@Controller
public class InsurancesController {
	
	@Autowired
	MemberRepository memberRepo;
	
	@RequestMapping("/member")
	public String member(Model model) {
		model.addAttribute("members", memberRepo.findAll());
		return "member";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String id) {
		memberRepo.deleteById(id);
		return "redirect:/member";
	}
	
	@RequestMapping("/create")
	public String create(Model model) {
	    return "create";
	}
	
	@RequestMapping("/show/{id}")
    public String show(@PathVariable String id, Model model) {
		Optional<Member> member = memberRepo.findById(id);
        model.addAttribute("member", member.get());
        return "show";
    }
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable String id, Model model) {
		Optional<Member> member = memberRepo.findById(id);
		model.addAttribute("member", member.get());
	    return "edit";
	}
	
	@RequestMapping("/save")
	public String save(@RequestParam String name,@RequestParam String surname,
						 @RequestParam Long policyNumber, @RequestParam String vehicleUrlImage) {
		
		Member member = new Member();
		member.setName(name);
		member.setSurname(surname);
		member.setPolicyNumber(policyNumber);
		member.setVehicleImageUrl(vehicleUrlImage);
		
		memberRepo.save(member);
		
		return "redirect:/show/" + member.getId();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String id,@RequestParam String name,@RequestParam String surname,
						 @RequestParam Long policyNumber, @RequestParam String vehicleUrlImage) {
		
		Optional<Member> optMember = memberRepo.findById(id);
		
		Member member = optMember.get();
		//Member member = new Member(vehicleImageUrl, vehicleImageUrl, vehicleImageUrl, policyNumber, vehicleImageUrl);
		member.setName(name);
		member.setSurname(surname);
		member.setPolicyNumber(policyNumber);
		member.setVehicleImageUrl(vehicleUrlImage);
		
		memberRepo.save(member);
		
		return "redirect:/show/" + member.getId();
	}

}
