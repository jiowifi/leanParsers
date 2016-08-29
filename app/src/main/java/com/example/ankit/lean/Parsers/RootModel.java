import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public int id;
	public String description;
	public String state;
	public String start_time;
	public String organizer_description;
	public VersionModel _version;
	public String logo;
	public String code_of_conduct;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String background_image;
	public String privacy;
	public String timezone;
	public String type;
	public String email;
	public String schedule_published_on;
	public String end_time;
	public String name;
	public String organizer_name;
	public CopyrightModel _copyright;

	public RootModel(Call_for_papersModel call_for_papers, CreatorModel creator, int id, String description, String state, String start_time, String organizer_description, VersionModel version, String logo, String code_of_conduct, String topic, ArrayList<Social_linksModel> social_links, String location_name, String background_image, String privacy, String timezone, String type, String email, String schedule_published_on, String end_time, String name, String organizer_name, CopyrightModel copyright) {

		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.id = id;
		this.description = description;
		this.state = state;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._version = version;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.social_links = social_links;
		this.location_name = location_name;
		this.background_image = background_image;
		this.privacy = privacy;
		this.timezone = timezone;
		this.type = type;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this._copyright = copyright;

	}

}