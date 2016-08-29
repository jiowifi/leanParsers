import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String privacy;
	public int id;
	public String location_name;
	public String end_time;
	public String description;
	public String state;
	public String logo;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public VersionModel _version;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String schedule_published_on;
	public String timezone;
	public String email;
	public String name;
	public CopyrightModel _copyright;
	public String type;
	public String topic;
	public String organizer_description;

	public RootModel(String organizer_name, String privacy, int id, String location_name, String end_time, String description, String state, String logo, String code_of_conduct, Call_for_papersModel call_for_papers, String start_time, VersionModel version, CreatorModel creator, ArrayList<Social_linksModel> social_links, String background_image, String schedule_published_on, String timezone, String email, String name, CopyrightModel copyright, String type, String topic, String organizer_description) {

		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.id = id;
		this.location_name = location_name;
		this.end_time = end_time;
		this.description = description;
		this.state = state;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this._version = version;
		this._creator = creator;
		this.social_links = social_links;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.email = email;
		this.name = name;
		this._copyright = copyright;
		this.type = type;
		this.topic = topic;
		this.organizer_description = organizer_description;

	}

}