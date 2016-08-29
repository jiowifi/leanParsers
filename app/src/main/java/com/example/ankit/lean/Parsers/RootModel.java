import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String type;
	public String description;
	public CopyrightModel _copyright;
	public String privacy;
	public String name;
	public String location_name;
	public String email;
	public String end_time;
	public String schedule_published_on;
	public String organizer_name;
	public String code_of_conduct;
	public String timezone;
	public String organizer_description;
	public String topic;
	public VersionModel _version;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public String background_image;
	public int id;

	public RootModel(Call_for_papersModel call_for_papers, String start_time, String type, String description, CopyrightModel copyright, String privacy, String name, String location_name, String email, String end_time, String schedule_published_on, String organizer_name, String code_of_conduct, String timezone, String organizer_description, String topic, VersionModel version, String state, ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, String background_image, int id) {

		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.type = type;
		this.description = description;
		this._copyright = copyright;
		this.privacy = privacy;
		this.name = name;
		this.location_name = location_name;
		this.email = email;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._version = version;
		this.state = state;
		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this.background_image = background_image;
		this.id = id;

	}

}