import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String timezone;
	public CreatorModel _creator;
	public String email;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String privacy;
	public String name;
	public String topic;
	public String type;
	public String location_name;
	public String description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String organizer_description;
	public String start_time;
	public String end_time;
	public int id;
	public String code_of_conduct;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String background_image;

	public RootModel(VersionModel version, String timezone, CreatorModel creator, String email, CopyrightModel copyright, String schedule_published_on, String privacy, String name, String topic, String type, String location_name, String description, String organizer_name, ArrayList<Social_linksModel> social_links, String state, String organizer_description, String start_time, String end_time, int id, String code_of_conduct, String logo, Call_for_papersModel call_for_papers, String background_image) {

		this._version = version;
		this.timezone = timezone;
		this._creator = creator;
		this.email = email;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.name = name;
		this.topic = topic;
		this.type = type;
		this.location_name = location_name;
		this.description = description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.state = state;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.end_time = end_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;

	}

}