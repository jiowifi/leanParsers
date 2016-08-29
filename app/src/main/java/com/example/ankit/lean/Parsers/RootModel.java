import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public VersionModel _version;
	public String organizer_description;
	public String background_image;
	public String description;
	public CreatorModel _creator;
	public String name;
	public String logo;
	public String schedule_published_on;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String organizer_name;
	public int id;
	public String type;
	public String end_time;
	public String start_time;
	public String state;
	public String email;

	public RootModel(CopyrightModel copyright, String code_of_conduct, String location_name, ArrayList<Social_linksModel> social_links, String privacy, VersionModel version, String organizer_description, String background_image, String description, CreatorModel creator, String name, String logo, String schedule_published_on, String timezone, Call_for_papersModel call_for_papers, String topic, String organizer_name, int id, String type, String end_time, String start_time, String state, String email) {

		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this._version = version;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.description = description;
		this._creator = creator;
		this.name = name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.id = id;
		this.type = type;
		this.end_time = end_time;
		this.start_time = start_time;
		this.state = state;
		this.email = email;

	}

}