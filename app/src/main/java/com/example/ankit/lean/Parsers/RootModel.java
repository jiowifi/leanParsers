import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String logo;
	public String location_name;
	public String type;
	public String state;
	public String email;
	public String background_image;
	public String description;
	public String name;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public VersionModel _version;
	public String timezone;
	public String organizer_name;
	public String end_time;
	public String organizer_description;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public CreatorModel _creator;
	public CopyrightModel _copyright;

	public RootModel(Call_for_papersModel call_for_papers, String privacy, String logo, String location_name, String type, String state, String email, String background_image, String description, String name, String code_of_conduct, String start_time, String topic, VersionModel version, String timezone, String organizer_name, String end_time, String organizer_description, int id, ArrayList<Social_linksModel> social_links, String schedule_published_on, CreatorModel creator, CopyrightModel copyright) {

		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.logo = logo;
		this.location_name = location_name;
		this.type = type;
		this.state = state;
		this.email = email;
		this.background_image = background_image;
		this.description = description;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this._version = version;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.id = id;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._copyright = copyright;

	}

}