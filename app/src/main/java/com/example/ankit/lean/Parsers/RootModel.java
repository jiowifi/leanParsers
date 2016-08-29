import java.util.ArrayList;

class RootModel {

	public String timezone;
	public int id;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String logo;
	public String state;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String privacy;
	public String organizer_name;
	public String email;
	public String background_image;
	public String organizer_description;
	public String start_time;
	public VersionModel _version;
	public String topic;
	public String schedule_published_on;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String end_time;
	public String description;

	public RootModel(String timezone, int id, CreatorModel creator, CopyrightModel copyright, String logo, String state, String code_of_conduct, ArrayList<Social_linksModel> social_links, String name, String privacy, String organizer_name, String email, String background_image, String organizer_description, String start_time, VersionModel version, String topic, String schedule_published_on, String type, Call_for_papersModel call_for_papers, String location_name, String end_time, String description) {

		this.timezone = timezone;
		this.id = id;
		this._creator = creator;
		this._copyright = copyright;
		this.logo = logo;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.name = name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.email = email;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._version = version;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.end_time = end_time;
		this.description = description;

	}

}