import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String description;
	public String email;
	public CopyrightModel _copyright;
	public int id;
	public String schedule_published_on;
	public String topic;
	public String background_image;
	public String organizer_name;
	public String location_name;
	public String privacy;
	public String logo;
	public String organizer_description;
	public String timezone;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String name;
	public CreatorModel _creator;
	public String state;
	public String type;
	public String start_time;

	public RootModel(VersionModel version, String description, String email, CopyrightModel copyright, int id, String schedule_published_on, String topic, String background_image, String organizer_name, String location_name, String privacy, String logo, String organizer_description, String timezone, String end_time, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String code_of_conduct, String name, CreatorModel creator, String state, String type, String start_time) {

		this._version = version;
		this.description = description;
		this.email = email;
		this._copyright = copyright;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._creator = creator;
		this.state = state;
		this.type = type;
		this.start_time = start_time;

	}

}