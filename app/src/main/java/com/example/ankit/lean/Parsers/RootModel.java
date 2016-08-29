import java.util.ArrayList;

class RootModel {

	public String location_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String organizer_name;
	public String type;
	public String start_time;
	public String end_time;
	public String schedule_published_on;
	public int id;
	public String description;
	public String state;
	public String logo;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String name;
	public String topic;
	public VersionModel _version;
	public String background_image;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public CreatorModel _creator;

	public RootModel(String location_name, CopyrightModel copyright, String privacy, String organizer_name, String type, String start_time, String end_time, String schedule_published_on, int id, String description, String state, String logo, String code_of_conduct, Call_for_papersModel call_for_papers, String timezone, String name, String topic, VersionModel version, String background_image, String organizer_description, ArrayList<Social_linksModel> social_links, String email, CreatorModel creator) {

		this.location_name = location_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.type = type;
		this.start_time = start_time;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.description = description;
		this.state = state;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.name = name;
		this.topic = topic;
		this._version = version;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.email = email;
		this._creator = creator;

	}

}