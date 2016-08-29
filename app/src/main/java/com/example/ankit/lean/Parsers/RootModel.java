import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String schedule_published_on;
	public String type;
	public String privacy;
	public String name;
	public String code_of_conduct;
	public String email;
	public int id;
	public String organizer_name;
	public String organizer_description;
	public VersionModel _version;
	public String topic;
	public CreatorModel _creator;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String background_image;
	public String logo;
	public String start_time;
	public String end_time;
	public CopyrightModel _copyright;
	public String timezone;

	public RootModel(ArrayList<Social_linksModel> social_links, String state, String schedule_published_on, String type, String privacy, String name, String code_of_conduct, String email, int id, String organizer_name, String organizer_description, VersionModel version, String topic, CreatorModel creator, String description, Call_for_papersModel call_for_papers, String location_name, String background_image, String logo, String start_time, String end_time, CopyrightModel copyright, String timezone) {

		this.social_links = social_links;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.privacy = privacy;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.id = id;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._version = version;
		this.topic = topic;
		this._creator = creator;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.background_image = background_image;
		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;
		this._copyright = copyright;
		this.timezone = timezone;

	}

}