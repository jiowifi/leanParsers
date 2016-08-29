import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String description;
	public String start_time;
	public String logo;
	public CreatorModel _creator;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String topic;
	public String location_name;
	public int id;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String name;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public String type;
	public String code_of_conduct;
	public String state;
	public String organizer_description;
	public String email;

	public RootModel(String end_time, String description, String start_time, String logo, CreatorModel creator, String schedule_published_on, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String topic, String location_name, int id, VersionModel version, Call_for_papersModel call_for_papers, String privacy, String name, String background_image, String timezone, String organizer_name, String type, String code_of_conduct, String state, String organizer_description, String email) {

		this.end_time = end_time;
		this.description = description;
		this.start_time = start_time;
		this.logo = logo;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._copyright = copyright;
		this.topic = topic;
		this.location_name = location_name;
		this.id = id;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.name = name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_description = organizer_description;
		this.email = email;

	}

}