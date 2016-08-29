import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public int id;
	public String schedule_published_on;
	public String state;
	public String email;
	public String description;
	public String type;
	public String topic;
	public String code_of_conduct;
	public String privacy;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String background_image;
	public String organizer_description;
	public String end_time;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String organizer_name;
	public String location_name;
	public CopyrightModel _copyright;
	public String start_time;

	public RootModel(CreatorModel creator, int id, String schedule_published_on, String state, String email, String description, String type, String topic, String code_of_conduct, String privacy, VersionModel version, ArrayList<Social_linksModel> social_links, String logo, String background_image, String organizer_description, String end_time, String timezone, Call_for_papersModel call_for_papers, String name, String organizer_name, String location_name, CopyrightModel copyright, String start_time) {

		this._creator = creator;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.email = email;
		this.description = description;
		this.type = type;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._version = version;
		this.social_links = social_links;
		this.logo = logo;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._copyright = copyright;
		this.start_time = start_time;

	}

}