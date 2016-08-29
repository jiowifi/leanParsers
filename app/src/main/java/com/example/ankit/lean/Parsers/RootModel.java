import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String state;
	public String code_of_conduct;
	public String timezone;
	public String organizer_name;
	public String name;
	public VersionModel _version;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String background_image;
	public String topic;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String start_time;
	public String end_time;
	public String location_name;
	public String description;
	public String privacy;
	public String logo;

	public RootModel(CopyrightModel copyright, String state, String code_of_conduct, String timezone, String organizer_name, String name, VersionModel version, String organizer_description, ArrayList<Social_linksModel> social_links, String type, String background_image, String topic, CreatorModel creator, String schedule_published_on, String email, Call_for_papersModel call_for_papers, int id, String start_time, String end_time, String location_name, String description, String privacy, String logo) {

		this._copyright = copyright;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.type = type;
		this.background_image = background_image;
		this.topic = topic;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.location_name = location_name;
		this.description = description;
		this.privacy = privacy;
		this.logo = logo;

	}

}