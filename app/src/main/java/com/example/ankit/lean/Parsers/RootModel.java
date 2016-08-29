import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String name;
	public String background_image;
	public VersionModel _version;
	public String logo;
	public String email;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String privacy;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public CopyrightModel _copyright;
	public String location_name;
	public String timezone;
	public int id;
	public String description;
	public String code_of_conduct;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String topic;
	public String organizer_name;

	public RootModel(String start_time, String name, String background_image, VersionModel version, String logo, String email, CreatorModel creator, String schedule_published_on, String privacy, String type, Call_for_papersModel call_for_papers, String state, CopyrightModel copyright, String location_name, String timezone, int id, String description, String code_of_conduct, String organizer_description, ArrayList<Social_linksModel> social_links, String end_time, String topic, String organizer_name) {

		this.start_time = start_time;
		this.name = name;
		this.background_image = background_image;
		this._version = version;
		this.logo = logo;
		this.email = email;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._copyright = copyright;
		this.location_name = location_name;
		this.timezone = timezone;
		this.id = id;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.end_time = end_time;
		this.topic = topic;
		this.organizer_name = organizer_name;

	}

}