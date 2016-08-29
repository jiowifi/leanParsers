import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String privacy;
	public CopyrightModel _copyright;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String end_time;
	public String code_of_conduct;
	public String organizer_description;
	public VersionModel _version;
	public String background_image;
	public String name;
	public String timezone;
	public int id;
	public String logo;
	public String start_time;
	public String state;
	public String description;
	public String topic;
	public String location_name;
	public CreatorModel _creator;
	public String email;

	public RootModel(Call_for_papersModel call_for_papers, String organizer_name, String privacy, CopyrightModel copyright, String type, ArrayList<Social_linksModel> social_links, String schedule_published_on, String end_time, String code_of_conduct, String organizer_description, VersionModel version, String background_image, String name, String timezone, int id, String logo, String start_time, String state, String description, String topic, String location_name, CreatorModel creator, String email) {

		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.type = type;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._version = version;
		this.background_image = background_image;
		this.name = name;
		this.timezone = timezone;
		this.id = id;
		this.logo = logo;
		this.start_time = start_time;
		this.state = state;
		this.description = description;
		this.topic = topic;
		this.location_name = location_name;
		this._creator = creator;
		this.email = email;

	}

}