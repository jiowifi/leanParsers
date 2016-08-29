import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String state;
	public CreatorModel _creator;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String code_of_conduct;
	public String privacy;
	public String description;
	public String organizer_description;
	public String organizer_name;
	public String timezone;
	public String schedule_published_on;
	public String location_name;
	public String background_image;
	public String logo;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String topic;
	public String name;
	public String start_time;
	public String end_time;

	public RootModel(CopyrightModel copyright, String state, CreatorModel creator, VersionModel version, Call_for_papersModel call_for_papers, String type, String code_of_conduct, String privacy, String description, String organizer_description, String organizer_name, String timezone, String schedule_published_on, String location_name, String background_image, String logo, int id, ArrayList<Social_linksModel> social_links, String email, String topic, String name, String start_time, String end_time) {

		this._copyright = copyright;
		this.state = state;
		this._creator = creator;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.description = description;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.background_image = background_image;
		this.logo = logo;
		this.id = id;
		this.social_links = social_links;
		this.email = email;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this.end_time = end_time;

	}

}